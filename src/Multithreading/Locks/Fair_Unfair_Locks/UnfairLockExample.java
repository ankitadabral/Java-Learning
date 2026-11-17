package Multithreading.Locks.Fair_Unfair_Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
An unfair lock is a lock that does not guarantee that the thread waiting the longest will acquire the lock first.
By default, ReentrantLock is unfair, meaning the order in which waiting threads acquire the lock is not guaranteed.
Short note:
new ReentrantLock() → Unfair lock by default
new ReentrantLock(true) → Fair lock
We use a fair lock to prevent thread starvation, so every waiting thread gets a fair chance to acquire the lock.
 */

public class UnfairLockExample {

    private final Lock unfairLock = new ReentrantLock();
    // Creates a ReentrantLock with the default unfair locking policy.
    // "Unfair" means there is NO guarantee that the thread waiting the longest
    // will acquire the lock next.

    public void accessResource() {
        unfairLock.lock(); // unfair hmne just object create krte time naam rkha he for example
        // The current thread tries to acquire the lock.
        // If another thread already holds the lock, this thread waits.
        try {
            System.out.println(Thread.currentThread().getName() + " acquired lock");
            // Prints the name of the thread that successfully acquired the lock.
            // Since this is an unfair lock, the output order is NOT guaranteed.
            // For example, Thread 2 may acquire the lock before Thread 1,
            // even if Thread 1 started waiting first.
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            // Restores the interrupt status of the current thread
            // after InterruptedException is caught.
        } finally {
            unfairLock.unlock();
        }
    }

    public static void main(String[] args) {
        UnfairLockExample example = new UnfairLockExample();
        // All three threads will use this same object and therefore
        // the same unfairLock.
        Runnable task = new Runnable() {
            @Override
            public void run() {
                // This method contains the task that each thread will execute.
                example.accessResource();
                // Each thread tries to access the same resource
                // using the same lock.
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
        // It will try to acquire the lock.

        thread2.start();
        // Starts Thread 2.
        // It may have to wait if Thread 1 already holds the lock.

        thread3.start();
        // Starts Thread 3.
        // It may also have to wait for the lock.
    }

}
