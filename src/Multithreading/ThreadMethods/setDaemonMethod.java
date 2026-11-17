package Multithreading.ThreadMethods;

public class setDaemonMethod extends Thread {

    public void run(){
        while(true){
            System.out.println("Hello world !");
        }

    }

    public static void main(String[] args) {   // main thread is a user thread

        setDaemonMethod t1 = new setDaemonMethod(); // Creating t1 thread

        t1.setDaemon(true); // Making t1 a daemon thread before starting it

        // JVM will not wait for t1 to complete because t1 is a daemon thread
        // When the main thread completes, JVM will terminate t1 automatically

        t1.start(); // Starts t1 and its run() method executes

        System.out.println("Main Done"); // Main thread completes here
    }
}

// DAEMON THREADS
// Daemon threads are background threads that support other threads.
// A daemon thread runs in the background.
// JVM does not wait for daemon threads to finish.
// When all non-daemon threads finish, JVM terminates daemon threads.
// setDaemon(true) is used to make a thread a daemon thread.
// setDaemon(true) must be called before start().