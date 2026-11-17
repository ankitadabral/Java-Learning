package Exception_Errors;

public class tryCatch {


// The code will compile successfully.
    // But when the program runs, an ArithmeticException will occur
    // when we try to divide 30 by 0.
    // Without exception handling, the program would stop at 30 / 0,
    // and the remaining code would not execute.
    // so we will handle those exception.


    public static void main(String[] args) {
        int[] numerators = {10, 200, 30, 40};
        int[] denominators = {1, 2, 0, 4};
        for (int i = 0; i < 10; i++) { // this line ill give Index out of bound exception)
            try {
                System.out.println(divide(numerators[i], denominators[i]));
            } catch (Exception e) { // here we are handling that IO exception
                System.out.println(e);
            }
            System.out.println("Good Job ");
        }
    }

    public static int divide(int a, int b) {
        // Here, we use try-catch to handle the exception,
        // so the program can continue executing.


        // try block contains code that may throw an exception
        try {

            //Student student = null; // here student(reference variable) is pointing to null, it means there is no object
            //student.setAge(34); // and here we are setting its age by using student
            // so it will throw a null pointer exception

            return a / b;

            // as above try block can throw multiple types of exception that' why we can use multiple catch block
            // and also the Exception class because many exception classes inherit from Exception, so a catch(Exception e) can catch those exceptions.
            //
            //And yes, you can have multiple catch blocks because one try block can potentially throw different types of exceptions.


        } catch (ArithmeticException e) { // here in catch block we need to send name of or type of exception
            // e is a reference variable that refers to the exception(or here ArithmeticException) object.
            System.out.println(e); // Printing 'e' will print information about the exception.
            //When e is printed using System.out.println(e), Java automatically calls e.toString(), which prints the exception class name and message, not the hash code.

            return -1;
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception"); // here iam printing my own message

            return -1;
        } catch (
                Exception e) {  // Specific/child exceptions → first, general/parent Exception → last. as Exception is parent class that's why it is in last
            System.out.println(e);
            return -1;
        }

        //a / b did not execute because the NullPointerException occurred before it, so the remaining code inside the try block was skipped.


    }


}
