package Multithreading.executorFramework.Executor_Basics;

import java.util.concurrent.*;

public class Executors_Example {
    public static void main(String[] args) {

        // Records the starting time to calculate total execution time.
        long startTime = System.currentTimeMillis();

        // Creates a thread pool containing 9 worker threads.
        // Executors is a utility class; newFixedThreadPool() creates the pool.
        // ExecutorService provides methods to submit tasks and manage their lifecycle.
        ExecutorService executor = Executors.newFixedThreadPool(9);

        // Submits 9 tasks, calculating factorials from 1 to 9.
        for (int i = 1; i < 10; i++) {

            // Creates an effectively final copy of i for use inside the lambda.
            // A lambda can capture only final or effectively final local variables.
            int finalI = i;

            // submit() sends the task to the executor and returns a Future.
            // Future can be used to check task status or retrieve its result.
            Future<?> future = executor.submit(() -> {

                // Calls factorial() for the current number.
                long result = factorial(finalI);

                // Prints the factorial result.
                System.out.println(result);

                // Note: This Runnable-style lambda returns no value to Future.
                // Therefore, future.get() would return null if called.
            });

        }


        // Stops accepting new tasks but allows already submitted tasks to finish.
        executor.shutdown();

        try {
            // Waits for termination for a maximum of 100 seconds in this call.
            // executor.awaitTermination(100, TimeUnit.SECONDS);

            // Repeatedly waits for 100 seconds per call until all tasks finish.
            // This is not one unlimited wait; it is repeated timed waiting.
            while (!executor.awaitTermination(100, TimeUnit.SECONDS)) {

                // Prints a message whenever the executor has not terminated yet.
                System.out.println("Waiting");
            }

        } catch (InterruptedException e) {

            // Converts the checked exception into a RuntimeException.
            throw new RuntimeException(e);
        }

        // Prints total elapsed time in milliseconds.
        System.out.println("Total Time: " +
                (System.currentTimeMillis() - startTime));
    }

    private static long factorial(int n) {

        try {
            // Simulates a time-consuming task by pausing the current worker thread.
            Thread.sleep(1000);

        } catch (InterruptedException e) {

            // Wraps InterruptedException in a RuntimeException.
            throw new RuntimeException(e);
        }

        // Initializes the factorial result to 1.
        long result = 1;

        // Calculates n! by multiplying numbers from 1 to n.
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        // Returns the calculated factorial.
        return result;
    }
}