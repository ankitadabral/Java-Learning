package constructors;

public class Student {
    // CONSTRUCTOR : Constructor is a special block in Java that is automatically called when an object is created and is used to initialize the object.


    private String name;
    private int age;
    private int rollNo;

    Student() {   // this is a no argument constructor as we writing it explicilty in the class and not passing any argument
        System.out.println("No arguments constructor");
        // inside this we can also set the values for variable if we want
    }

    Student(String name, int age, int rollNo) {  // this is a parameterized constructor as we are passing the arguments or parameters
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    Student(String name) {
        this.name = name;

    }

    Student(int age, int rollNo) {
        this.age = age;
        this.rollNo = rollNo;
    }

    Student(int rollNo) {
        this.rollNo = rollNo;
    }
    // Above mentioned all the 3-4 way are correct and we can write constructor like these
    // And also in above we are doing constructor overloading. same name different parameters


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


// By default if we have not written any constructor then java will itself call the default constructor when we create the object of class
// TYPES oF conSTRuctor
    /* Default Constructor: Java compiler automatically provides it when no constructor is written.
No-Argument Constructor: A constructor written by us that takes no arguments.
Parameterized Constructor: A constructor that takes one or more arguments to initialize the object.
     */
// the name of constructor should be same as class name, there is no return type for constructor.
// we can overload constructor