package oops.inheritance_Overriding.multiLevel_inheritance;

public class Parents extends Grandparent {
public Parents(int age, String name) {
    super(age, name);
    System.out.println("Parent constructor is called");
}

    public void parentMethod(){
        System.out.println("Parent method called");
    }

}
