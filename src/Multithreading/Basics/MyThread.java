package Multithreading.Basics;
// Here We are checking State of Thread

// In this class we have created the main method and also the same class is extending the Thread class
// It means we are creating the tread of the same class in which we are having main method

public class MyThread extends Thread {

    @Override
    public void run() {
        // To handle the exception which the thread method might throw we are using try catch
        try {
            System.out.println("RUNNING STATE");
            Thread.sleep(2000); // here it pauses the current thread(t1 thread as this method is executed by t1 thread and not main)
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException{

        MyThread t1 = new MyThread();// Here thread is just created, so it is in NEW state
        System.out.println(t1.getState()); // here we are checking the state of thread

        t1.start(); // here thread is in Runnable state
        System.out.println(t1.getState());

        // Here we are printing the state of current thread
        System.out.println(Thread.currentThread().getState());

        Thread.sleep(100); // Pauses the current thread (the thread executing this particular line here it is main thread) for 100 milliseconds.
        // It does NOT specifically mean Thread-1; whichever thread executes this line will sleep.
        //t1 thread will not sleep by this

        System.out.println(t1.getState());// here now the state of t1 thread is TIMED WAITING
        //as t1 thread currently is in sleep or waiting for 2sec

        t1.join();// Makes the current thread (here, main thread) wait until t1 thread completes its execution.
        // Here, main thread waits for t1 to finish before continuing.
        System.out.println(t1.getState()); // here the output or state is TERMINATED
        // as due to join method main thread is waiting till t1 thread finishes the execution or completed

    }
}
