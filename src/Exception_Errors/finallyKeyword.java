package Exception_Errors;
//finally can be used with try alone or with try-catch, but it cannot be used independently.
//try → catch → finally → return
//try → finally → return


public class finallyKeyword {
    public static void main(String[] args) {
        System.out.println(divide(30, 3));


    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            return -1;
        } finally { // here we are using finally block to print something which we want to print whether try and catch block runs or not
            System.out.println("bye");
        }

        // here in output first the bye will get print and then return -1
        //try → catch → finally → return
    }
}



/*
// EXAMPLE OF TRY CATCH FINALLY BLOCKS ORDER
// To run this example comment out all the code above from class name till last and then uncomment below code and run
public class finallyKeyword {
    public static void main(String[] args) {

        try{
            System.out.println("Inside try block");  // 1 this line will get printed
            int res = 10/0;
        }catch(ArithmeticException e){
            System.out.println("Exception caught "+ e);// 2 this line
        }finally{
            System.out.println("Inside Finally block"); // and lastly this line
        }

        // Here there is no return statement that's why the output is in this order
    }
    }

    */
