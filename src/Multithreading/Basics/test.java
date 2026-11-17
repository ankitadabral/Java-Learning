package Multithreading.Basics;

public class test {


    /*
    // THIS BELOW CODE IS TO RUN THE METHOD 1 OF EXTENDING THREAD CLASS

    //When a Java program starts, one thread begins running immediately, which is called the main thread.
    // This thread is responsible for executing the main() method of a program.

    public static void main(String[] args) {

        // creating object of that in class in which we have created thread (or written our task)
        World world = new World();  //Here the new thread is created as world is the subclass of thread class

        //calling the start method of that class to initiate the new thread
        world.start();  // and here the thread is started   RUNNABLE → CPU milte hi execute

        for (; ; ) {   // creating infinite loop
            System.out.println("Hello");


            // To know the name of current working/ running thread
            System.out.println(Thread.currentThread().getName());

        }

        // To know the name of current working/ running thread
        //  System.out.println(Thread.currentThread().getName());

    }  */


    // THIS BELOW CODE IS TO RUN THE METHOD 2 OF IMPLEMENTING RUNNABLE INTERFACE

    /*
    A new class World is created that implements Runnable.
The run method is overridden to define the code that constitutes the new thread.
A Thread object is created by passing an instance of world2 class.
start method is called on the Thread object to initiate the new thread.
     */


    public static void main(String[] args) {

        // creating object of that in class in which we have created thread (or written our task)
        World2 world2 = new World2();

// Create a Thread object by passing the object of the class that implements the Runnable interface to the Thread constructor.
        Thread t1 = new Thread(world2);   // here the new thread is created

        t1.start();  // here the thread is started  RUNNABLE → CPU milte hi execute

        for (; ; ) {   // creating infinite loop
            System.out.println("Hello");


            // To know the name of current working/ running thread
            System.out.println(Thread.currentThread().getName());

        }

    }
}

