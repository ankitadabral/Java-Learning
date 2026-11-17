package Multithreading.Locks.Explicit_Intrinsic_Lock;

public class Test {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        Runnable task = new Runnable() {
            // We cannot directly create an object of the Runnable interface
            // So, we create an anonymous class that implements Runnable
            // and create an object of that anonymous class

            // We could also extend the Thread class,
            // but here we are using the Runnable interface

            @Override
            public void run() {
                // run() contains the task that the thread will execute

                sbi.withdraw(50);
                // Calls withdraw() on the same BankAccount object
                // Both threads will use this same bankAccount object
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        // Creates a Thread object and passes the Runnable task to it
        // "Thread 1" sets the name of this thread

        Thread t2 = new Thread(task, "Thread 2");
        // Creates another Thread object using the same Runnable task
        // "Thread 2" sets the name of this thread

        t1.start();
        // Starts Thread 1
        // JVM calls the run() method of the Runnable task

        t2.start();
        // Starts Thread 2
        // JVM calls the same run() method for Thread 2
    }
}