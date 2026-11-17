package oops.inheritance_Overriding.multiLevel_inheritance;

public class Child extends Parents {
    public Child(int age, String name) {
      //  super(); // this statement is by default present in the first line of a constructor and we donot need to write it explicitly
        // and it points to the parennt class of current class
        // and this hidden super() line means ki we want that ffirst the parent class constructor should get executed and initialize the object first and then our costructor will be called

        super(age, name);
        System.out.println("Child constructor is called");
    }

    // now we are overriding 1 parent method
    public void childMethod() {
        super.parentMethod();// here by using super keyword we can call any method of parent class or child's parent class
        System.out.println("Child Method called");
        //And most imp constructor me super keyword first line me rhta he bt in another place we can write it on any line
        // IMP - super keyword refers to the immediate parent class
        // super can use to invoke parent class constructor and field
    }

}
