package recursion;

public class practice {
    public static void main(String[] args) {
        System.out.println(factorial(5));

        // Using METHOD 2
        System.out.println(sumOfNaturalNums(10));

    }

    // RECURSION - A method calling itself is called recursion
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1); // this is called recursion. here recursion is happening.
        // If we only write till above line then our code will end up into a continuous loop as it we goes on like 5,4,3,2,1,0,-1,-2,...
        // to end this we need to mention a stop statement
        // hence we are writing if loop in starting


        // instead of below mentioned code we are directly calling the method it self
        /*
        int res = 1;
        for (int i = 1; i<=n ; i++){
                res = res * i;
                }
                return res;
         */
    }


    // QUESTION : FInd sum of N natural numbers through recursion
    // Creating METHOD 2
    public static int sumOfNaturalNums(int a) {
        if (a == 0) {
            return 0;
        }
        return a + sumOfNaturalNums(a - 1);
    }


}

//NOTE : CALL STACK - It is the part of memory which tracks the methods calls
// Whenever Java calls a method, it puts that method's information on top of the stack. When the method finishes, Java removes it from the top.
//Call stack = memory area that keeps track of currently active method calls, following LIFO (Last In, First Out).

