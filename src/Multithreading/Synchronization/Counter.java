package Multithreading.Synchronization;

public class Counter {
    private int count = 0;

    public synchronized void increment() {  // We are using synchronized keyword here so that when multiple threads are accessing this at a time only 1 thread will access it
        // so that the output will be guaranteed correct
        count++;

        // UNCOMMENT BELOW TO CHECK SYNCHRONIZED BLOCK
        /*
        synchronized (this) {  // If we do not want to make whole method synchronized
            // then in that case we can use synchronized block for that particular line of code
            count++;
        }   */
        // synchronized allows only one thread at a time to execute this method
        // It prevents multiple threads from modifying the shared count at the same time
        // This prevents race conditions and gives a consistent/correct result

        // SYNCHRONIZATION : Synchronization is a mechanism that controls access to shared data so that only one thread can access the critical section at a time.
        //MUTUAL EXCLUSION is the property of synchronization that ensures only one thread can access a critical section at a time. Other threads must wait until the current thread finishes executing the critical section
        //RELATIONSHIP
        //Synchronization is the mechanism, while mutual exclusion is one of the main properties achieved through synchronization.
    }

    public int getCount() {
        return count;
    }


}
