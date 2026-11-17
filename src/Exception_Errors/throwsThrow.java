package Exception_Errors;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class throwsThrow {
    public static void main(String[] args) throws IOException {
     method2(); // Output will be the exception which method 1 will throw
        System.out.println("Hello");
    }

    public static void method2() throws FileNotFoundException{
        method1();
    }

    //throws is used to tell the caller of a method that this method may throw an exception.
    // here we have added throws in method1 and already sated that
    //"This method may(It means the method declares the possibility of throwing that exception.) throw an IOException; whoever calls this method must handle it."


    // IF YOU WANT TO CHECK THROWS TRY THIS OR CAN TRY AFTER THIS ONE ALSO
   /* public static void method1() throws FileNotFoundException{
        FileReader fileReader = new FileReader("a.txt"); // this line will throw a checked exception
        // As the compiler know that this line will throw an error
        // So It Must be handled either by try catch or throws keyword

    }       */


    // IF YOU WANT TO CHECK THROW CHECK THIS ONE

    public static void method1() throws FileNotFoundException{
        throw new FileNotFoundException(); // Actually create and throw the exception right now.
        // here we are using throw keyword to forcefully throwing the exception
    }
}
