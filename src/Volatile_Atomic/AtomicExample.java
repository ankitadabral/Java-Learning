package Volatile_Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    // AtomicInteger is used because multiple threads are updating
    // the same counter variable simultaneously.
    // It makes increment operations thread-safe.
    // It prevents lost updates when multiple threads increment together.
    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {

        // incrementAndGet() atomically increases the value by 1.
        // Atomic operation means the complete increment happens as one indivisible operation.
        // No other thread can interfere in between reading and updating the value.
        counter.incrementAndGet();
    }

    public int getCounter() {

        // get() safely returns the current value of AtomicInteger.
        return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {

        AtomicExample atomicExample = new AtomicExample();

        // Thread t1 will increment the shared counter 1000 times.
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                atomicExample.increment();
            }
        });

        // Thread t2 will also increment the SAME counter 1000 times.
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                atomicExample.increment();
            }
        });

        // Both threads start executing concurrently.
        t1.start();
        t2.start();

        // join() makes the main thread wait until t1 finishes.
        t1.join();

        // Main thread waits until t2 also finishes.
        t2.join();

        // Both threads have completed, so the final counter should be 2000.
        System.out.println(atomicExample.getCounter());
    }
}
