package WrapperClasses;

//Wrapper classes are classes that provide object representations of Java's primitive data types.
public class test {
    public static void main(String[] args) {

        int a = 1; // primitive data type
        // 1 will be stored in stack

        Integer b = 1; // wrapper object /class
        // here 1 will be stored in heap as here b is reference to an object

        Integer b1 = a;  // Autoboxing - Primitive data type conversion to its wrapper class object

        int c = b; // Autounboxing - Automatic conversion of  wrapper class object to its corresponding primitive data type

        // wrapper object supports many methods

        System.out.println(Integer.max(3,5));
        System.out.println(Integer.toBinaryString(89));
        System.out.println(Integer.min(-1, 5));
        String str ="123";
        Integer i = Integer.valueOf(str);
        System.out.println(i);

    }
}
