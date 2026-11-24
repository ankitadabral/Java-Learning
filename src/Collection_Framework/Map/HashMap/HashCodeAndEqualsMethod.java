
package Collection_Framework.Map.HashMap;

import java.util.HashMap;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {

        HashMap<Student, String> map = new HashMap<>();

        Student s1 = new Student("Alice", 1);
        Student s2 = new Student("Alice", 2);
        Student s3 = new Student("Alice", 3);

        // Storing Student objects as keys and their designations as values.
        map.put(s1, "Engineer"); // hashCode1 ----> index1
        map.put(s2, "Designer"); // hashCode2 ----> index2
        map.put(s3, "manager");  // hashCode3 ----> index3

        // All three Student objects have different IDs.
        // Therefore, equals() returns false when compared with each other.
        // Their hashCodes are also different for these particular values,
        // but different objects can have the same hashCode (Hash Collision).

        System.out.println("Hashmap size : " + map.size());
        System.out.println("Value for s1 : " + map.get(s1));
        System.out.println("Value for s3 : " + map.get(s3));

        // So here, what is happening?
        // We have created a Student class and passed its object reference as a key in HashMap.

        // Even though all three objects have the same name,
        // their IDs are different, so they are considered different keys.

        // We have overridden hashCode() and equals() methods from the Object class.
        // hashCode() generates a hash value using the name and ID fields.
        // equals() compares the name and ID fields to check logical equality.

        // If we had NOT overridden these methods,
        // Object's default equals() would compare object references,
        // and its default hashCode() would provide identity-based hash codes.
        // It is not guaranteed to be the actual memory address.

        // This behaviour is different from String and Integer classes
        // because they already have their own implementations of equals() and hashCode().

        // Whenever we create a custom class and want its objects
        // to be used as logical keys in HashMap, we should override
        // both equals() and hashCode() consistently.

        // Important: If two objects are equal according to equals(),
        // they MUST have the same hashCode().
        // However, two objects having the same hashCode()
        // does not necessarily mean they are equal.
    }
}


class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    //Object obj = Every class in java extends Object class
    //so here we are defining that in this method we can accept object of anyy class
    // also we are overriding these below methods in our class

    public boolean equals(Object obj) {

        // Step 1: Check whether both references point to the same object.
        if (this == obj) {
            return true;
        }

        // Step 2: If the other object is null, they cannot be equal.
        if (obj == null) {
            return false;
        }

        // Step 3: Check whether both objects belong to the same class.
        if (getClass() != obj.getClass()) {
            return false;
        }

        // Step 4: Typecast Object into Student so that we can access
        // Student-specific fields and methods.
        Student other = (Student) obj;

        // Step 5: Compare both ID and name.
        // Both conditions must be true for the objects to be considered equal.
        return id == other.getId() && Objects.equals(name, other.getName());
    }


    @Override
    public int hashCode() {

        // Generates a hash code using both name and ID.
        // Objects.hash() internally combines the hash values of the given fields.
        // Objects that are equal according to equals() will get the same hash code.
        return Objects.hash(name, id);
    }


    @Override
    public String toString() {

        // Defines how a Student object will be represented when printed.
        return "id: " + id + ", name: " + name;
    }
}
