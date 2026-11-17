package overloadingSignatureMutability;

// QUESTION : Return a number that is prime

public class practice {
    public static void main(String[] args) {

        // Using method
        int d = 4;
        System.out.println(isPrime(d));

    }
    // Creating METHOD

    public static boolean isPrime(int d) {// here as you can see return type and parameter type are diff
        // so yes it is possible to have different return type and parameter type
        int e = 0;
        for (int n = 1; n <= d; n++) {
            if (d % n == 0) {
                e++;
            }
        }
        if (e == 2) {
            return true;
        } else {
            return false;
        }
        // OR we can easily return
        // return== 2;  instead of above if loop

    }
}
