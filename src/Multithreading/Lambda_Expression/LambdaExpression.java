
package Multithreading.Lambda_Expression;
// LAMBDA EXPRESSIONS are Anonymous function.
//A Lambda Expression is a short way of implementing the single abstract method of a Functional Interface.
//(parameters) -> {
//    // body
//      }
//
// Functional Interface = an Interface which contains exactly ONE Abstract method.
// Lambda Expression is used to provide the implementation of that one Abstract method.
// Lambda Expression can be thought of as a shorter way of writing an Anonymous Class.
// Instead of creating an Anonymous Class and overriding its single abstract method,
// we can directly write its implementation using Lambda.
//
// NOTE: Technically in Java, we call it a "Lambda Expression", not an "Anonymous Function".

public class   LambdaExpression {
// RUNNABLE is a functional Interface (which contains only  1 Abstract method)
    // Runnable has only one abstract method:
    // void run();
    // Therefore, Lambda can be used with Runnable.
    // Lambda will provide the implementation of run() method.

    public static void main(String[] args){
        // This is one way first make anonymous function and then pass it to Thread object
        //To check this way uncomment below code

        /*
        Runnable task1 = () -> System.out.println("Hello"); //this is lambda expression

        // Runnable is the Functional Interface reference.
        // task1 is the reference variable.
        // Lambda Expression provides the implementation of Runnable's run() method.
        //
        // So:
        // Runnable task1 = Lambda implementation of run();

        Thread t1 = new Thread(task1);

        // Here we are passing the Runnable reference to the Thread object.
        // Thread will execute the run() method implementation provided by Lambda.

        t1.start();

        // start() starts a new thread.
        // The new thread executes the run() method,
        // so the Lambda Expression gets executed.

         */


        // We can make this shorter by this way
        Thread t1 = new Thread(() -> {    // This whole thing inside parenthesis of Thread is implementation class of Runnable interface

            // Instead of first creating a separate Runnable reference (task1)
            // and then passing it to Thread,
            // we directly pass the Lambda Expression to the Thread constructor.
            //
            // This Lambda Expression is providing the implementation
            // of Runnable's only abstract method: run().
            //
            // So this is basically the shorter version of:
            //
            // Runnable task1 = () -> {
            //     ...
            // };
            // Thread t1 = new Thread(task1);

            for(int i=0; i<10; i++) {
                System.out.println("Hello World");
            }
        });
        t1.start();
    }
}

