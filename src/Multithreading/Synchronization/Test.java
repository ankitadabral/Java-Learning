package Multithreading.Synchronization;

public class Test {

    public static void main(String[] args) {

        Counter c = new Counter();
        // Creates a Counter object and stores its reference in counter

        MyThread t1 = new MyThread(c);
        // Creates a MyThread object and passes the Counter object reference to its constructor
        // The same Counter object reference is stored inside MyThread's counter variable

        MyThread t2 = new MyThread(c);   // creating 1 more object or thread

        t1.start();
        // Starts t1 thread, so t1's run() method starts executing

        t2.start();
        // Starts t2 thread, so t2's run() method starts executing
        // Both t1 and t2 are now working on the same Counter object (sharing the same resource)

        try {

            t1.join();
            // Main thread waits here until t1 finishes its run() method

            t2.join();
            // After t1 finishes, main waits here until t2 finishes its run() method

        } catch (InterruptedException e) {
            // join() can be interrupted while main is waiting
            // If main is interrupted, this block handles that exception
        }

        System.out.println(c.getCount());
        // Prints the final count after both t1 and t2 have completed
    }
// If we does not use synchronized keyword in increment inside Counter class then the race condition will come
    // here Race condition will come due to same resource sharing so correct output will not be guaranteed
    // RACE CONDITION : Race condition is a situation where multiple threads access shared data concurrently,
    // causing unexpected or incorrect results depending on the execution timing of the threads.
}