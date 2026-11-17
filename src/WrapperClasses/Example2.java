package WrapperClasses;

public class Example2 {
    public static void main(String[] args) {
        Integer b = 1;
        Integer c = 3;
        fun(b);
        System.out.println(b); // output will be 1 only as b is still pointing to 1
        int x = 1;
        int y= 2;
        System.out.println(x == y); //Output will be false

        //we can also check equality of wrapper class object same as we are doing for integer
        System.out.println(b == c); // output : false

        // but as these are objects so we can also check their equality by
        System.out.println(b.equals(c));
    }

    private static void fun(Integer a){
        a=2;
    }

}
