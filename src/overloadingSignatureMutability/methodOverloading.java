package overloadingSignatureMutability;

public class methodOverloading {
    public static void main(String[] args) {


        // Using the method 1 for printing sum of array
        int[] a = {1, 2, 3, 4, 5};
        int sum = sumOfArray(a); // here we are storing the sum returned by method in a variable
        System.out.println("Sum of array is " + " " + sum); // here we are printing sum


        // Using Method 2 for returning string in upper case
        String res = upperCase("   ankita   "); // directly passing the string in method
        System.out.println(res);


        // Using the method 3 for printing sum of two numbers
        System.out.println("sum of 2 numbers is" + " " + sumOfTwoNums(7, 9)); // here we are directly giving the value during printing time


        // Using the method 3 for printing sum of two numbers
        System.out.println("sum of 3 numbers is" + " " + sumOfTwoNums(7, 9, 8));


        // Using METHOD 4
        int x = 10; // so this x is not same as the x which we define in our method both of them are different.
        // It is just that this x variable's value gets copied and passed to the method in place of x (method's x)
        System.out.println(multiplyBy10(x)); // Output will be 100 as this x value is getting passed in method and then multiplying with 10
        System.out.println(x); // Output will be 10 as this is the x which we have defined in main method and its value we have assigned is 10.


        //Using METHOD 5 for passing multiple values
        System.out.println("sum" + (sumOF(2, 4, 5, 6)));// here we can pass multiple arguments and do not need to define a array
        // as we have already defined arg array in our method

    }


    //Syntax of a method
    /*
    accessModifier static returnType methodName(parameters) {
    // method body
     }
     */

    // Creating a METHOD 1 for printing sum of array
    public static int sumOfArray(int[] arr) {    // as we are returning something that's why we are not using void.
        // the type which we are returning that type we can write here we are returning integer so passing int
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum; // here we are not printing something in method and just returning the sum
    }


    // Creating a Method 2 for removing the spaces and convert it into uppercase
    public static String upperCase(String str) {
        return str.trim().toUpperCase();  // we are directly returning str without storing the value in any new string

    }

    // Creating a METHOD 3 for printing sum of 2 no.s
    public static int sumOfTwoNums(int a, int b) {
        return a + b;
    }


    // Creating a Method 4 for printing sum of 3 numbers
    // Below mentioned method has same return type same, method name same, everything is same except parametrs
    // This is called METHOD OVERLOADING
    //Method overloading means having multiple methods with the same name but different parameters in the same class.

    public static int sumOfTwoNums(int a, int b, int c) {
        return a + b + c;
    }


    //Method signature - Method name + Parameter list
    public static float sumOfTwoNums(float a, float b, float c) {
        return a + b + c;

    }


    //Creating a METHOD 4 to multiply digit by 10
    public static int multiplyBy10(int x) {
        return x * 10;
    }

    // Creating a METHOD 5  which can accept multiple argument in parametrs
    public static int sumOF(int... a) {// here we have placed 3... it means thi can except mutiple arguments
        // internally it is treated as a array
        int sum = 0;
        for (int ar : a) { // here it is treated as aarray
            sum += ar;
        }
        return sum;


    }
}














 /* NOTEEEE
    Mandatory for Method Overloading
✅ Method name: Same
✅ Parameters: Must be different
Number of parameters, OR
Type of parameters, OR
Order of parameters
Not Mandatory
❌ Return type: Can be same or different
❌ public/private/protected: Can be different
❌ static: Not required to be same
     */