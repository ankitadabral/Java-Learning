package Multithreading.Basics;
// METHOD 2 OF CREATING THREaD BY IMPLEMENTING RUNNABLE INTERFACE

public class World2 implements Runnable{

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
