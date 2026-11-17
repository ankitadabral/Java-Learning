package Multithreading.executorFramework.Executors_Service_Methods;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Callable_invokeAll_invoke_future {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Creates an ExecutorService that uses one worker thread; tasks execute one at a time
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Callable is a functional interface; lambda implements call() and returns a String
        Callable<String> callable = () -> "Hello";

        // Submits the Callable task for execution; Future represents its result, which can be retrieved using get()
        Future<String> future = executorService.submit(callable);

        // We can do like below-mentioned syntax also

        // Callable task; returns Integer 42, and Future<Integer> represents the result
        // Future<Integer> future = executorService.submit(() -> 42); // submit type 1(callable)

        // Callable task; returns String "Hello"; ? means the exact result type is not specified in the Future reference
        // Future<?> future = executorService.submit(() -> "Hello");

        // Runnable task; prints Hello and returns no value; Future<?> represents its completion, not a meaningful result
        // Future<?> future = executorService.submit(()-> {System.out.println("Hello");});   submit type 2(Runnable without returning anything future.get is null)

        // Used to execute a Runnable task and return a custom result ("Success") via future.get(), since Runnable itself returns nothing.
        //Future<?> future = executorService.submit(()-> System.out.println("Hello"),"Success" );  // submit type 3(Runnable with returning something future.get returns the value we send in result)


        System.out.println(future.get()); // Waits until the task completes and retrieves its result; prints Hello

        if (future.isDone()) { // Checks whether the task has completed, failed, or been cancelled; returns a boolean
            System.out.println("Task is done"); // Prints this message if isDone() returns true
        }

        executorService.shutdown(); // Stops accepting new tasks; previously submitted tasks are allowed to finish





   //   /*

        // Below is the Example of the invokeAll() method
// Creates a thread pool with 2 worker threads; at most 2 tasks can execute simultaneously
        ExecutorService executorService1 = Executors.newFixedThreadPool(2);

// Callable task 1: prints "Task 1" and returns Integer 1
        Callable<Integer> callable1 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 1");
            return 1;
        };

// Callable task 2: prints "Task 2" and returns Integer 2
        Callable<Integer> callable2 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 2");
            return 2;
        };

// Callable task 3: prints "Task 3" and returns Integer 3
        Callable<Integer> callable3 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 3");
            return 3;
        };

// Stores all three Callable tasks in a List
        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

// Submits all tasks for execution and returns a List of Future objects;

        // Declares a List of Future objects to store the results of the submitted tasks
        List<Future<Integer>> futures = null;

        // Submits all tasks and waits until all tasks complete;
        // returns a List of Future objects in the same order as the submitted tasks
        // invokeAll() normally returns after all tasks have completed
        futures = executorService1.invokeAll(list);

         try {
             // Submits all tasks with a maximum waiting time of 1 second;
             // tasks that have not completed when the timeout expires are cancelled
             // Returns a List of Future objects, including cancelled Futures
             futures = executorService1.invokeAll(list, 1, TimeUnit.SECONDS);
         }catch (InterruptedException e){
             // Handles interruption while waiting for tasks to complete or the timeout to expire

         }

// Iterates through each Future and retrieves its task result using get();
// get() returns the Integer value produced by the corresponding Callable
        for (Future<Integer> f : futures) {
            try {
                // Retrieves the result; waits if the task is still running
                // Throws CancellationException if the task was cancelled
                // Throws ExecutionException if the task failed
                System.out.println(f.get());
            }catch (CancellationException e){

                // Handles a Future whose task was cancelled, for example, due to the timeout
            } catch (InterruptedException e) {
                // Handles interruption while waiting for the result

            } catch (ExecutionException e) {
                // Handles an exception thrown while executing the Callable task
            }
        }
// Stops accepting new tasks; previously submitted tasks are allowed to finish
        executorService1.shutdown();
        // Till here

              //  */




         /*

        // Below is the example of invoke any() uncomment it to check AND COMMENT OUT INVOKE ALL CODE TO RUN
        ExecutorService executorService1 = Executors.newFixedThreadPool(2);

// Callable task 1: prints "Task 1" and returns Integer 1
        Callable<Integer> callable1 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 1");
            return 1;
        };

// Callable task 2: prints "Task 2" and returns Integer 2
        Callable<Integer> callable2 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 2");
            return 2;
        };

// Callable task 3: prints "Task 3" and returns Integer 3
        Callable<Integer> callable3 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 3");
            return 3;
        };

// Stores all three Callable tasks in a List
        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

        Integer i = executorService1.invokeAny(list);
        System.out.println(i);

        executorService1.shutdown();

        // TILL HERE

        */





        System.out.println(executorService.isShutdown()); // Returns true if shutdown() or shutdownNow() has been called; otherwise returns false.

        Thread.sleep(1000); // comment out this line then is terminated will return false
        System.out.println(executorService.isTerminated()); //System.out.println(executorService.isTerminated()); // Returns true if all tasks have completed after shutdown; otherwise returns false.
    }
}
