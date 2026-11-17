package Multithreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
Read-Write Lock — Definition
A Read-Write Lock is a lock that allows multiple threads to read a shared resource at the same time, but allows only one thread to write or modify it at a time.

It improves performance by allowing multiple readers to access the resource simultaneously while keeping write operations exclusive and safe.

Easy memory point:
Read → Multiple threads ✅
Write → Only one thread ✅
Write ke time → Readers wait ⏳
 */

public class ReadWriteLock {

    private int count = 0;
    // Shared data that will be read and updated by multiple threads.

    private final java.util.concurrent.locks.ReadWriteLock lock = new ReentrantReadWriteLock();
    // Creates a ReadWriteLock object.
    // ReadWriteLock is an interface and ReentrantReadWriteLock is its implementation.
    // This lock provides two separate locks: Read Lock and Write Lock.

    private final Lock readlock = lock.readLock();
    // readLock() returns the Lock object used for reading.
    // The returned Lock object is stored in the readlock reference.
    // Multiple threads can hold the read lock at the same time.
    private final Lock writelock = lock.writeLock();
    // writeLock() returns the Lock object used for writing/updating.
    // The returned Lock object is stored in the writelock reference.
    // Only one thread can hold the write lock at a time.

    public void increment() throws InterruptedException {
        writelock.lock();
        // Acquires the write lock.
        // While a thread is writing, other readers and writers must wait.
        try {
            count++;
            // Updates the shared data.
            // Only one thread can execute this protected operation at a time.
            Thread.sleep(50);
        } finally {
            writelock.unlock();
            // Releases the write lock so that another waiting thread can proceed.
        }
    }

    public int getCount() {
        readlock.lock();
        // Acquires the read lock.
        // Multiple threads can acquire the read lock at the same time.
        try {
            Thread.sleep(1000);
            return count;
            // Reads and returns the current value of count.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            readlock.unlock();
            // Releases the read lock.
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteLock counter = new ReadWriteLock();
        // Creates one ReadWriteCounter object.
        // All threads will use this same object and the same locks.

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " read " + counter.getCount());
                    // Reads the count 10 times.
                    // Multiple reader threads can perform this simultaneously.
                }
            }
        };

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        counter.increment();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    // Increases the count by 1.
                    // Uses the write lock because shared data is being modified.
                    System.out.println(Thread.currentThread().getName() + " incremented");
                    // Prints the name of the thread after incrementing the count.
                }
            }
        };

        Thread writerThread0 = new Thread(writeTask, "Writer Thread0");
        // Creates a thread that will perform the write operation.
        Thread readerThread1 = new Thread(readTask, "Reader Thread1");
        // Creates the first reader thread.
        Thread readerThread2 = new Thread(readTask, "Reader Thread2");
        // Creates the second reader thread.

        writerThread0.start();
        // Starts the writer thread.
        // It tries to acquire the write lock and increment the count.
        readerThread1.start();
        // Starts the first reader thread.
        // It tries to acquire the read lock.
        readerThread2.start();
        // Starts the second reader thread.
        // It can read at the same time as readerThread1
        // if no thread is holding the write lock.

        writerThread0.join();
        // Main thread waits until the writer thread finishes.
        readerThread1.join();
        // Main thread waits until readerThread1 finishes.
        readerThread2.join();
        // Main thread waits until readerThread2 finishes.
    }
}