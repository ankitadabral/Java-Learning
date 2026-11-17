/* CountDownLatch is a synchronization tool that allows one or more threads to wait until a certain number of operations are completed.
The easiest way to understand it:
A CountDownLatch is like a countdown. A thread waits until the countdown reaches 0 */

package Multithreading;

import java.util.concurrent.*;

public class Countdown_latch {
    public static void main(String[] args) throws InterruptedException {

        // Creates a latch with an initial count of 3
        CountDownLatch latch = new CountDownLatch(3);

        // Creates a thread pool with 3 worker threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 3; i++) {
            int task = i; // Stores the current task number

            executorService.submit(() -> {
                try {
                    System.out.println("Task " + task + " completed");

                } finally {
                    latch.countDown(); // Decreases the count after the task finishes
                }

            });
        }

        latch.await(5, TimeUnit.SECONDS); // Main thread waits until the latch count becomes 0

        System.out.println("All tasks completed. Main continues!");

        executorService.shutdown(); // Stops accepting new tasks


        // OR YOU CAN CHECK BELOW-MENTIONED CODE AS WELL
        /*
        ExecutorService executor = Executors.newFixedThreadPool(3);

        CountDownLatch latch = new CountDownLatch(3);

        List<Callable<Integer>> callableList = List.of(
                () -> {
                    System.out.println(Thread.currentThread().getName());
                    latch.countDown();
                    return 200;
                },
                () -> {
                    System.out.println(Thread.currentThread().getName());
                    latch.countDown();
                    return 400;
                },
                () -> {
                    System.out.println(Thread.currentThread().getName());
                    latch.countDown();
                    return 600;
                }
        );
        executor.invokeAll(callableList);

        latch.await(); // this makes the main thread to wait for the countdown to reach 0 before resuming its execution.
        System.out.println("All Task is Completed");
        executor.shutdown();

         */
    }
}