package oops.ecapsulation;

public class student {
    // A CLASS contains properties/fields/instances variable & behaviour

    String name;
    private int rollNumber;
    private int age;
    // here name, age, rollNo are instance variable as they are declared inside a class. This is the property/fields

    //Now as we have make age varibale private so no we will write getter and setter method.
    // so that outside the class these variables are accessible with the help of getter and setter method

    public void setAge(int age) {
        if (age < 0) {
            age = 0;
        }
        this.age = age; // here this.age is pointing to the instance/variable on which we are going to call this set method
    }

    // below is the getter method for age
    public int getAge() {
        return this.age = age;
    }

    public void setRollNumber(int rollNumber) {
        if (rollNumber < 0) {
            rollNumber = 0;
        }
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}



/*
A local variable is a variable declared inside a method, constructor, or block.
It belongs only to that method/block.
You must initialize it before using it.
You cannot access it outside that method/block.

An instance variable is a variable declared inside a class but outside methods/constructors.
It belongs to an object (instance) of the class.
Each object can have its own copy.
Java gives it a default value if you don't initialize it.
 */