package accessModifiers.Test;

public class singletonPattern {     // creating Public class, so it can be accessed from other packages/classes.


    private static singletonPattern instance;
    // A static variable that stores the reference of the single object.
    // Initially, its value is null because no object has been created yet.
    // syntax private       → access modifier
    //static        → static keyword
    //singletonPattern → data type (class name)
    //instance      → variable name
    // A private static variable named instance is declared, whose type is singletonPattern.

    private singletonPattern(){
        // Private constructor prevents other classes from creating
        // objects directly using: new singletonPattern().

    }

    public static singletonPattern getInstance(){
        // Public static method used to get the object of this class.
        // static allows us to call this method without creating an object.
        //Method name can be anything, but getInstance() is the standard/common name used in Singleton Pattern.

        if(instance == null){
            // Checks whether an object has already been created.
            // If instance is null, no object exists yet.

            instance = new singletonPattern();
            // Creates the object for the first time and stores its
            // reference in the instance variable.


        }
        return instance;
        // Returns the existing object.
        // If the object already exists, the same object is returned
        // instead of creating a new one.

    }
}

/*
If we call getInstance() 4 times:
singletonPattern a = singletonPattern.getInstance();
singletonPattern b = singletonPattern.getInstance();
singletonPattern c = singletonPattern.getInstance();
singletonPattern d = singletonPattern.getInstance();
Output / Result:
1st call → New Object created → Object 1
2nd call → Same Object 1 returned
3rd call → Same Object 1 returned
4th call → Same Object 1 returned
 */

// NOTE - this class can have other normal methods and code as well.
// above is the code to create singleton patter or single object
