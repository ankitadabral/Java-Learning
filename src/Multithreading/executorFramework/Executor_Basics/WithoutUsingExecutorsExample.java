
package Multithreading.executorFramework.Executor_Basics;

public class WithoutUsingExecutorsExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //Creating a Thread array which
        // Stores 9 Thread references.
        // IMPORTANT: Thread[] threads = new Thread[9] does NOT create 9 Thread objects.
        // It only creates an array with 9 empty slots (null references).
        Thread[] threads = new Thread[9];

        for (int i = 1; i < 10; i++) {

            // Lambda runs later inside the new Thread.
            // We need a separate variable because i keeps changing in the loop.
            // finalI remains fixed for each thread.
            int finalI = i;

            // new Thread(...) creates a Thread object.
            // The lambda provides the implementation of the Runnable's run() method.
            threads[i - 1] = new Thread(
                    () -> {
                        // This code executes when this Thread starts.
                        long result = factorial(finalI);
                        System.out.println(result);

                    }
            );

            // start() starts the new thread.
            // IMPORTANT: start() does NOT wait for this thread to finish.
            // Main thread can immediately continue to create/start the next thread.
            threads[i - 1].start();
        }

        // All 9 threads have already been started above.
        // This loop now makes the MAIN thread wait for each thread to finish.
        // join() blocks the current thread (here: main thread), not the worker thread.
        for (Thread thread : threads) {
            try {
                // Wait until the current Thread finishes.
                thread.join();
            } catch (InterruptedException e) {
                // If main thread is interrupted, restore its interrupted status.
                Thread.currentThread().interrupt();
            }
        }


        // This line executes only after all 9 threads have finished.
        // Since factorial() has Thread.sleep(1000), the 9 threads can run concurrently.
        // Therefore total time is roughly around 1 second + some overhead,
        // instead of around 9 seconds if we joined each thread inside the first loop.
        System.out.println("Total Time: " + (System.currentTimeMillis() - startTime));

    }

    private static long factorial(int n) {
        try {
            // Pauses the CURRENT worker thread for 1 second.
            // Other worker threads can continue running during this time.
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // If this thread is interrupted, stop by throwing an exception.
            throw new RuntimeException(e);
        }

        // Calculate factorial of n.
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}

