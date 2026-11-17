package Multithreading.Locks.Explicit_Intrinsic_Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
LOCKS : A lock is a mechanism that allows only one thread at a time to access a protected section of code or shared resource.
1. INTRINSIC LOCK :Every Java object has an intrinsic lock (monitor lock), which can be used through the synchronized keyword.
2. EXPLICIT LOCK : Explicit locks are provided through the java.util.concurrent.locks package and allow programmers to manually acquire and release locks.
Explicit locks are used when we need more control over lock acquisition and release than synchronized provides.
 */
public class BankAccount {

    private int balance = 100;
    // Shared data that can be accessed by multiple threads

    // COMMENT BELOW CODE TO RUN INTRINSIC LOCK CODE
    private final Lock lock = new ReentrantLock();
    // Creates a ReentrantLock object
    // Lock is an interface and ReentrantLock is a class that implements Lock
    // 'final' means the lock reference cannot be changed to another object

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        // Prints the name of the thread that is currently executing this method

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                // Tries to acquire the lock
                // Waits for a maximum of 1000 microseconds if the lock is already held
                // Returns true if the lock is acquired
                // Returns false if the lock could not be acquired within the given time
                if (balance >= amount) {
                    // Checks whether sufficient balance is available
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding withdraw ");
                        // Prints the thread name before performing the withdrawal

                        Thread.sleep(3000);
                        // Pauses the current thread for 3 seconds
                        // Important: sleep() does NOT release the ReentrantLock

                        balance -= amount;
                        // Deducts the withdrawal amount from the shared balance

                        System.out.println(Thread.currentThread().getName() + " Completed withdraw. Remaining balance " + balance);
                        // Prints the thread name and remaining balance

                    } catch (Exception e) {
                        // Handles exceptions that may occur during the withdrawal
                       Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                        // Releases the lock
                        // This allows another waiting thread to acquire the lock
                    }

                } else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient balance ");
                    // Executes when there is not enough balance
                }

            } else {

                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later");
                // Executes when the thread could not acquire the lock
                // within the specified waiting time
            }

        } catch (Exception e) {
            // Handles exceptions that may occur while trying to acquire the lock
            Thread.currentThread().interrupt();
        }
    }


    /* UNCOMMENT BELOW CODE FOR INTRINSIC LOCK EXAMPLE
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " proceeding withdraw ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() +" Completed withdraw " + balance);

        } else {
            System.out.println(Thread.currentThread().getName() + " Insufficient balance ");
        }
    }     */

}