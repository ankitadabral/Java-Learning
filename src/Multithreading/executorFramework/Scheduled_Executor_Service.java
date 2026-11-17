
package Multithreading.executorFramework;

import java.util.concurrent.*;

public class Scheduled_Executor_Service {
    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(4);
        // Creates a thread pool with 4 worker threads.
        // Used to schedule tasks for delayed or repeated execution.


/*
        // 1. Below is the example of schedule() method
        // Uncomment below to run and comment out others

        scheduler.schedule(
                () -> System.out.println("Task executed after 5 seconds delay !"), 5,
                TimeUnit.SECONDS);

        // schedule() executes a task only ONCE after the given delay.
        // Here, the task will execute after approximately 5 seconds.
        // It returns ScheduledFuture<?>.
        // We can use the returned Future to check status or cancel the task.
        // shutdown() stops accepting new tasks.
        // A delayed task that has not started may not execute after shutdown().
        scheduler.shutdown();

        // Till here
*/


        // 2. Below is the example of scheduleAtFixedRate() method

        // scheduleAtFixedRate() executes a task repeatedly at a fixed rate.
        // Parameters: task, initialDelay, period, TimeUnit.
        // Here, the first execution is scheduled after 5 seconds.
        // After that, the next executions are scheduled at a 5-second period.
        // The timing is based on the scheduled start times, not task completion times.
        // If one execution takes longer than the period, the next execution starts
        // only after the previous execution finishes; executions of this periodic
        // task do not overlap.
        // If an execution throws an exception, future executions are suppressed.

        scheduler.scheduleAtFixedRate(
                () -> System.out.println("Task executed after every 5 seconds !"), 5,
                5, TimeUnit.SECONDS);




        // 3. Below is the example of scheduleWithFixedDelay()
        // Comment out the code above if you want to check this method clearly and separately.

        // scheduleWithFixedDelay() executes a task repeatedly with a fixed delay
        // between the completion of one execution and the start of the next.
        // Parameters: task, initialDelay, delay, TimeUnit.
        // Here, the first execution is scheduled after 5 seconds.
        // After each execution finishes, it waits another 5 seconds before the next one.
        // Unlike fixed rate, the delay is measured from the completion time.
        // Executions of this periodic task do not overlap.
        // If an execution throws an exception, future executions are suppressed.

        ScheduledFuture<?> scheduledFuture = scheduler.scheduleWithFixedDelay(
                () -> System.out.println("Task executed after 5 seconds of completion of previous task !"), 5,
                5, TimeUnit.SECONDS);

        // We can also use ScheduledFuture methods with this object:
        // get() - waits for completion; for a periodic task, it normally does not return
        // unless the task is cancelled or terminates exceptionally.
        // isDone() - true if the task completed, was cancelled, or failed.
        // isCancelled() - true if the task was successfully cancelled.
        // cancel(true/false) - attempts to cancel the scheduled task.
        // For a periodic task, get() is generally not used to retrieve each execution's result.

        // Till here



        // We schedule a separate one-time task to initiate shutdown after 20 seconds.
        // This allows the periodic tasks to run for some time before shutdown is initiated.
        // Calling shutdown() immediately would stop accepting new tasks and,
        // by default, already-scheduled periodic executions are cancelled.
        // The shutdown task itself is scheduled on the same scheduler.

        scheduler.schedule(() -> {
            System.out.println("Initiating shutdown... ");
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);

    }
}

//Definition: newCachedThreadPool() is a factory method of the Executors class that creates an ExecutorService with a thread pool that can dynamically
// create new threads when needed and reuse previously created threads when they become available.
// Idle threads are terminated after 60 seconds by default.
