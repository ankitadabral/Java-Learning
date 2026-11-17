package Multithreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    private final Lock lock = new ReentrantLock();

    public void outerMethod() {

        lock.lock();
        //OR
        //lock.lockInterruptibly();
        //lockInterruptibly() is a method of the Lock interface that allows a thread to wait for a lock, but if the thread is interrupted while waiting, it stops waiting and throws an InterruptedException.


        // Acquires the lock for the current thread
        // Initially the lock is free, so the current thread gets the lock
        // Hold count becomes 1
        // IMPORTANT:
        // This is the SAME lock object that innerMethod() will use
        // outerMethod() does NOT have a separate lock
        try {
            System.out.println("Outer method");
            // Prints "Outer method"
            innerMethod();
            // Calls innerMethod()
            // innerMethod() uses the SAME 'lock' object
        } finally {
            lock.unlock();
            // Releases one hold on the lock
            // Hold count decreases from 1 to 0
            // The lock becomes completely free
        }
    }

    public void innerMethod() {
        lock.lock();
        // Uses the SAME ReentrantLock object already acquired by outerMethod()
        // The current thread already owns this lock
        // Because ReentrantLock is REENTRANT, the SAME THREAD
        // can acquire the SAME LOCK multiple times without blocking itself
        // This is NOT a new lock
        // Hold count increases from 1 to 2
        // ReentrantLock prevents a SAME THREAD from getting stuck
        // while trying to acquire a lock that it already owns
        try {
            System.out.println("Inner Method");
            // Prints "Inner Method"
        } finally {
            lock.unlock();
            // Releases one hold on the lock
            // Hold count decreases from 2 to 1
            // IMPORTANT:
            // The lock is NOT completely free yet
            // because outerMethod() is still holding the lock
        }
    }

    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        // Creates a ReentrantExample object
        // This object contains ONE ReentrantLock object
        example.outerMethod();
        // Calls outerMethod()
        // Execution starts from outerMethod()
    }
}

/*
REENTRANT LOCK:
1. ReentrantLock is a class that implements the Lock interface.
2. ReentrantLock allows the SAME THREAD to acquire the SAME LOCK
   multiple times without blocking itself.
3. Every successful lock() increases the hold count by 1.
4. Every unlock() decreases the hold count by 1.
5. The lock becomes completely free when the hold count becomes 0.
6. Every successful lock() must have a corresponding unlock().
7. ReentrantLock prevents a SAME THREAD from getting stuck waiting
   for a lock that it already owns.

DEADLOCK:
Deadlock is a situation where two or more threads are permanently
waiting for locks/resources held by each other, so none of them
can proceed.
Example:
 Thread 1:
    Lock A → acquired
    Lock B → waiting
    Thread 2:
    Lock B → acquired
    Lock A → waiting
    Thread 1 waits for Thread 2
    Thread 2 waits for Thread 1
    → DEADLOCK

REENTRANT LOCK AND DEADLOCK:
1. ReentrantLock prevents the self-deadlock situation where the
   SAME THREAD tries to acquire the SAME LOCK again.
2. ReentrantLock does NOT automatically prevent deadlocks involving
   MULTIPLE THREADS and MULTIPLE LOCKS.
3. So, ReentrantLock is reentrant, but it is NOT deadlock-proof.
 */