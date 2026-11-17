
package Multithreading.ThreadMethods;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;


// CompletableFuture is a class in Java that is used for asynchronous programming.
// It allows tasks to execute independently without blocking the main thread
// and provides methods to handle, combine, and process results when tasks are completed.

public class Completable_Future {
    public static void main(String[] args) {

        // CompletableFuture uses daemon threads by default when using supplyAsync()
        // with the common ForkJoinPool, so the main thread does not wait for its execution to complete automatically.

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {

            // supplyAsync() executes the given task asynchronously.
            // It uses a Supplier functional interface because the task returns a result.

            try {
                Thread.sleep(5000); // Pauses the worker thread for 5 seconds.

                System.out.println("Worker"); // Executes after 5 seconds.

            } catch (Exception e) {
                // Handles exceptions occurring during thread execution.
            }

            return "ok"; // Returns the result of the asynchronous task.
        });

        String s = null; // Variable to store the result returned by CompletableFuture.

        try {
           // s = completableFuture.getNow("nooo");// This getNow method is used - if the result is present then it will return the result
            // and if the result is not present at that time then it will return the default value here "nooo"

            s = completableFuture.get();
            // get() blocks the main thread until the CompletableFuture completes
            // and returns its result.
            // Without this line, the main thread will not wait for the task's result.

        } catch (InterruptedException e) {
            // Occurs if the main thread is interrupted while waiting.

            throw new RuntimeException(e);

        } catch (ExecutionException e) {
            // Occurs if an exception is thrown during asynchronous task execution.

            throw new RuntimeException(e);
        }

        System.out.println(s); // Prints the result returned by the CompletableFuture.
        System.out.println("Main"); // Executes after get() returns the result.
    }
}
