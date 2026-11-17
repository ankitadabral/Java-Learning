
package Multithreading.Thread_Communication;


class SharedResource {
    private int data; // Stores the actual data produced by Producer
    private boolean hasData; // Tells whether data is available for Consumer or not

    public synchronized void produce(int value) { // synchronized allows only one thread at a time to access this method

        while (hasData) { // Producer waits if previous data has not been consumed yet
            try {
                wait(); // THREAD COMMUNICATION: Producer waits and releases the lock until Consumer calls notify()
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restores the interrupted status of the thread
            }

        }
        data = value; // Stores the value produced by Producer
        hasData = true; // Marks that data is now available for Consumer
        System.out.println("Produced: " + data); // Prints the produced value

        notify(); // THREAD COMMUNICATION: Wakes up one waiting thread, usually Consumer
    }

    public synchronized int consume() { // synchronized allows only one thread at a time to access this method
        while (!hasData) { // Consumer waits if no data is available
            try {
                wait(); // THREAD COMMUNICATION: Consumer waits and releases the lock until Producer calls notify()
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restores the interrupted status of the thread
            }
        }
        hasData = false; // Marks that the data has been consumed
        System.out.println("Consumed: " + data); // Prints the consumed value

        notify(); // THREAD COMMUNICATION: Wakes up one waiting thread, usually Producer
        return data; // Returns the data consumed by Consumer
    }
}

class Producer implements Runnable {
    private SharedResource resource; // Reference to the shared resource

    public Producer(SharedResource resource) { // Receives the shared resource object
        this.resource = resource; // Stores the same shared resource used by Consumer
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.produce(i); // Sends i to produce(), e.g. produce(0), produce(1), etc.
        }
    }
}

class Consumer implements Runnable {

    private SharedResource resource; // Reference to the shared resource

    public Consumer(SharedResource resource) { // Receives the shared resource object
        this.resource = resource; // Stores the same shared resource used by Producer

    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = resource.consume(); // Calls consume() without passing a value; it returns the data stored by Producer
        }

    }

}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource(); // Creates one shared resource object

        Thread producerThread = new Thread(new Producer(resource)); // Creates Producer thread and passes the shared resource
        Thread consumerThread = new Thread(new Consumer(resource)); // Creates Consumer thread and passes the SAME shared resource

        producerThread.start(); // Starts Producer thread
        consumerThread.start(); // Starts Consumer thread
    }
}

