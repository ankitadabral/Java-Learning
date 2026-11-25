package Collection_Framework.Map.IdentityHashMap;

// In Comparable, we define the comparison logic inside the class,
// whereas in Comparator, we define it outside the class.
// Comparable uses the compareTo(T a) method,
// whereas Comparator uses the compare(T a, T b) method.
// Comparable is generally used when we want to define a natural/default sorting order for a class.
// Comparator is used when we need multiple or different sorting orders based on different fields.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Student class implements Comparable interface
// It defines the natural sorting order of Student objects
class Student implements Comparable<Student> {

    int marks;
    String name;

    // Constructor to initialize student details
    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    // compareTo() defines how two Student objects will be compared
    @Override
    public int compareTo(Student s) {

        // Compare marks in ascending order
        // Negative: Current object comes first
        // Positive: Other object comes first
        // Zero: Both objects are equal according to comparison
        return this.marks - s.marks;
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        // Creating an ArrayList of Student objects
        List<Student> students = new ArrayList<>();

        // Adding Student objects to the list
        students.add(new Student(80, "Rahul"));
        students.add(new Student(50, "Aman"));
        students.add(new Student(90, "Priya"));

        // Sorting the list using natural ordering
        // Internally, it uses the compareTo() method
        Collections.sort(students);

        // Printing the sorted student details
        for (Student s : students) {
            System.out.println(s.name + " : " + s.marks);
        }
    }
}
