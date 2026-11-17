
package Multithreading.executorFramework.Executors_Service_Methods;

import java.util.concurrent.*;

public class future_methods {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> future = executorService.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception Occurred : " + e);
            }
            System.out.println("Hello");
            return 42;
        });


        /*
        // Below is future.get() with TIME example
        // Comment out below future.cancel example and then run it

        Integer i = null;
        try {
            i = future.get(1, TimeUnit.SECONDS);
            System.out.println(future.isDone());
            System.out.println(i);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            System.out.println("Exception Occurred: " + e);
        }

        // future.get(1, TimeUnit.SECONDS) waits for at most 1 second
        // Our task sleeps for 2 seconds, so TimeoutException will occur
        // TimeoutException does NOT cancel the running task
        // future.get() returns the result only when the task completes
        // isDone() and i will print only if get() returns successfully
        // In this example, those statements will be skipped due to TimeoutException

        // till here
        */




        // Below is future.cancel() method example

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception Occurred : " + e);
        }

        future.cancel(false);

        // future.cancel(true) means:
        // If the task has not started, it can be cancelled
        // If the task is already running, Java attempts to interrupt it
        // Interrupting does not guarantee that the task will stop

        // future.cancel(false) means:
        // If the task has not started, it can be cancelled
        // If the task is already running, do not interrupt it
        // So the running task may continue executing in the background

        // Here main thread sleeps for 1 second, while the task sleeps for 2 seconds
        // Therefore, the task will normally already be running when cancel(false) is called
        // cancel(false) can mark the Future as cancelled even though the task keeps running

        System.out.println("task cancelled : " + future.isCancelled());
        // isCancelled() returns true if the Future was successfully cancelled

        System.out.println("task done : " + future.isDone());
        // isDone() returns true if the task completed, failed, or was cancelled
        // isDone() = true does NOT necessarily mean the task stopped running
        // Here both isCancelled() and isDone() can print true
        // even if the background task later prints Hello

        // till here

        executorService.shutdown();
    }
}
