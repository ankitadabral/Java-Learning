package Multithreading.Basics;
// METHOD 1 TO CREATE NEW THREAD BY EXTENDING THREAD CLASS
/*
A new class World is created that extends Thread.
The run method is overridden to define the code that constitutes the new thread.
start method is called to initiate the new thread
 */


//extending thread class to create a new thread to do a task
public class World extends Thread{

    // overriding the run method of thread class
    @Override
    public void run() {

        // writing task/ execution code inside run method
        for(; ;){  // creating infinite loop
            System.out.println("World");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
