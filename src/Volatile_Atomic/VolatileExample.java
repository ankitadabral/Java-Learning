package Volatile_Atomic;

class SharedObj{

    // we have make this variable volatile so that thread can pick its value from main memory instead of thread cache/local memory
    // volatile ensures that changes made by one thread are visible to other threads.
    // It also prevents the reader thread from using a stale cached value of this variable.
    private volatile boolean flag = false;

    public void setFlagTrue(){
        System.out.println("Writer Thread made the flag true !");
        // The writer thread updates the shared flag from false to true.
        // This change becomes visible to other threads because the variable is volatile.
        flag = true;
    }

    public void printIfFlagTrue(){
        while(!flag){
            // do nothing
            // The reader thread continuously checks the value of flag.
            // This is called busy waiting because the thread keeps checking without doing useful work.
        }
        // This line will never gets print in output until we will not make the local variable VOLATILE
        //as reader thread will never comes out from above while loop
        // It is because every thread saves a local copy of variables in its cache for performance reasons
        // and as by above method we have change flag value as true in RAM/ main memory
        // but in readerThread cache it is still false

        // once we will make the variable volatile then this will get print
        // as the thread will pick value of local variable from main memory instead of its cache or local memory

        // Once flag becomes true, the while loop terminates.
        // The reader thread then executes the statement below.
        System.out.println("Flag is true");
    }
}

public class VolatileExample {
    public static void main(String[] args) {

        // Creating a shared object that will be accessed by both threads.
        SharedObj sharedObj = new SharedObj();

        Thread writerThread = new Thread(() ->{
            try {
                Thread.sleep(1000);
                // Pauses the writer thread for 1 second before updating the flag.
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                // Restores the interrupted status of the current thread.
            }
            sharedObj.setFlagTrue();
            // Calls the method that changes the shared flag to true.
        });

        Thread readerThread = new Thread(() -> sharedObj.printIfFlagTrue());
        // Starts the reader task, which keeps checking the flag until it becomes true.

        writerThread.start();
        // Starts the writer thread.

        readerThread.start();
        // Starts the reader thread.

    }
}
