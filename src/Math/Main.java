package Math;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;

        int max = Math.max(a, b);
        System.out.println(max);

        int min = Math.min(a, b);
        System.out.println(min);

        int c = -11;
        int abs = Math.abs(c); // to find absolute value or positive value
        System.out.println(abs);

        double d = 1.52;
        double ceil = Math.ceil(d); // Math.ceil is used to print smallest integer greater than d or any given value
        System.out.println(ceil);

        System.out.println(Math.floor(d)); //Math.floor() returns the greatest integer value that is less than or equal to the given number.

        System.out.println(Math.round(d)); //Math.round() rounds a number to the nearest integer.

        int e =144;
        System.out.println(Math.sqrt(e));// Math.sqrt finds square root of a number

        System.out.println(Math.pow(12, 2)); // To find power of given number

        System.out.println(Math.log(10)); // to find log

        System.out.println(1 + Math.PI);

        System.out.println(Math.random()); // To generate any random number
}
}
