package Multithreading.Synchronization;

public class MyThread extends Thread {
    // MyThread inherits from Thread, so its objects can be used as threads

    private Counter counter;
    // Reference variable to store a Counter object

    public MyThread(Counter counter) {
        // Constructor that receives a Counter object reference

        this.counter = counter;
        // Stores the received Counter reference in the current MyThread object
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
