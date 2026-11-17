
package Multithreading.Lambda_Expression;

public class Test {
    public static void main(String[] args) {

        // 1. Below is the first way to directly use an interface by ANONYMOUS CLASS
        //
        // Student is a Functional Interface, so it has only ONE abstract method.
        // Here we create an Anonymous Class and provide the implementation
        // of that single abstract method.
        Student engineeringStudent = new Student() {
            @Override
            public void getBio(String name) {
                // return name + " is Engineering Student";
                //OR instead of above line
                System.out.println(name + " is Engineering student");
            }
        };

        //2. Below is the second way to directly use an interface by
        // ANONYMOUS FUNCTION / LAMBDA EXPRESSION

        /* For normal Lambda expression uncomment below code
        Student lawStudent = (String name) -> {

            // Here (String name) is the parameter of getBio(String name).
            // Lambda knows that this is the implementation of getBio()
            // because Student is a Functional Interface with only ONE abstract method.

            //return name + " is Law Student";
            //OR instead of above line
            System.out.println(name + " is Engineering student");
              };
            */

        // And if we have only 1 parameter then we can remove the parenthesis
        // (String name) → name
        // And if we only have 1 line of code then we can remove the inside curly braces as well
        // (String name) -> { System.out.println(...); }
        // becomes
        // name -> System.out.println(...);

        Student lawStudent = name -> System.out.println(name + " is law student");

        // Here:
        // Student → Functional Interface reference
        // name -> System.out.println(...) → Lambda Expression
        // Lambda → implementation of Student's single abstract method getBio()
        // This is basically a shorter version of the Anonymous Class written above.
    }
}
