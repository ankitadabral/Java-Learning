package Multithreading.Locks.Fair_Unfair_Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLockExample {

    private final Lock lock = new ReentrantLock(true);
    // Creates a ReentrantLock with fairness enabled.
    // 'true' means the lock follows a fair ordering for waiting threads.
    // A waiting thread gets a fair chance to acquire the lock.
    // This helps prevent thread starvation.

    public void accessResource() {

        lock.lock();
        // Acquires the lock.
        // If another thread already holds the lock, the current thread waits.
        // With a fair lock, waiting threads are given a fair chance
        // to acquire the lock.

        try {

            System.out.println(Thread.currentThread().getName() + " acquired lock");
            // Prints the name of the thread that acquired the lock.

            Thread.sleep(1000);
        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();
            // Restores the interrupt status of the current thread
            // after InterruptedException is caught.

        } finally {

            lock.unlock();
        }
    }

    public static void main(String[] args) {

        FairnessLockExample example = new FairnessLockExample();
        // Creates one FairnessLockExample object.
        // All three threads will use this same object and therefore
        // the same lock.


        Runnable task = new Runnable() {

            @Override
            public void run() {
                // This method contains the task that each thread will execute.

                example.accessResource();
                // Each thread tries to access the same resource
                // using the same fair lock.
            }
        };


        Thread thread1 = new Thread(task, "Thread 1");
        // Creates Thread 1 using the same Runnable task.


        Thread thread2 = new Thread(task, "Thread 2");
        // Creates Thread 2 using the same Runnable task.


        Thread thread3 = new Thread(task, "Thread 3");
        // Creates Thread 3 using the same Runnable task.


        thread1.start();
        // Starts Thread 1.
        // It tries to acquire the lock.


        thread2.start();
        // Starts Thread 2.
        // If Thread 1 already holds the lock, Thread 2 waits.


        thread3.start();
        // Starts Thread 3.
        // If the lock is busy, Thread 3 waits.
        //
        // Since this is a fair lock, waiting threads get a fair chance
        // to acquire the lock instead of one thread repeatedly being skipped.
        //
        // This helps prevent THREAD STARVATION:
        // a situation where a thread keeps waiting for a long time
        // because other threads repeatedly get the lock before it.
    }
}