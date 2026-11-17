package oops.inheritance_Overriding.inheritance;

public class Dog extends Animal {
    @Override // it is a annotation to make ure that this method is actually correctly overriding
    public void sayHello() { // Dog class overrided this method by writing its own defination.
        // so this above thing is called METHOD OVERRIDING
        System.out.println("Woof");
    }
}
