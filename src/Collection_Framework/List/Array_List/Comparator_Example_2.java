
package Collection_Framework.List.Array_List;

import java.util.ArrayList;
import java.util.List;

class Student {

    private String name;
    private double cgpa;

    // Constructor to initialize Student object properties
    public Student(String name, Double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    // Getter method to access the student's name
    public String getName() {
        return name;
    }

    // Getter method to access the student's CGPA
    public Double getCgpa() {
        return cgpa;
    }

}

public class Comparator_Example_2 {

    public static void main(String[] args) {

        // Creating an ArrayList to store Student objects
        List<Student> student = new ArrayList<>();

        // Adding Student objects to the list
        student.add(new Student("Shivani", 3.6));
        student.add(new Student("Anil", 3.7));
        student.add(new Student("Warda", 3.6));
        student.add(new Student("Charlie", 3.2));
        student.add(new Student("Bobby", 4.1));

        // Here we do not directly use the below-mentioned line to sort in default order
        // student.sort(null);

        // This is because default sorting does not work automatically for custom classes.
        // Built-in classes like String and Integer have predefined natural ordering.
        // But in the case of Student, we need to define the sorting order explicitly.

        // BUT WE CAN USE COMPARATOR IN THIS CASE

        // Here CGPA values are in double format, so we cannot directly cast their difference to int.
        // The compare() method expects an int return value.
        // student.sort((o1, o2) -> (int) (o2.getCgpa() - o1.getCgpa()));
        // But this line will not sort correctly because casting a fractional difference to int
        // can convert it to zero, even when the two CGPA values are different.

        // So we will do this
        student.sort((o1, o2) -> {

            // Compare CGPA values in descending order
            if ((o2.getCgpa() - o1.getCgpa() > 0)) {
                return 1; // o1 should come after o2
            } else if ((o2.getCgpa() - o1.getCgpa() < 0)) {
                return -1; // o1 should come before o2
            } else {

                // If CGPA values are equal, sort students by name alphabetically
                // We are using the String compareTo() method

                // It returns 0 if both names are equal
                // It returns a positive value if o1 comes after o2 alphabetically
                // It returns a negative value if o1 comes before o2 alphabetically

                return o1.getName().compareTo(o2.getName());
            }
        });

        // Now print the list in sorted order
        for (Student s : student) {

            // Print the name and CGPA of each student
            System.out.println("Printing list in descending order of CGPA: ");
            System.out.println(s.getName() + ":" + s.getCgpa());
        }
    }
}
