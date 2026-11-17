package WrapperClasses;

public class Example1 {
    public static void main(String[] args) {
        Student x = new Student();
        // `new Student()` → creates a Student OBJECT in memory.
        // `x` → reference variable pointing to that Student object.

        x.id = 1;
        // We use `x` to access the object, so its id becomes 1.

        fun(x);
        // The reference stored in `x` is passed to `fun()`.
        // Initially, `a` also points to the SAME object as `x`.

        System.out.println(x.id);
        // `x` is still pointing to the original object,
        // whose id is still 1.
    }

    private static void fun(Student a) {

        Student student = new Student();
        // `new Student()` → creates a NEW Student OBJECT.
        // `student` points to this NEW object.

        student.id = 2;
        // The NEW object now has id = 2.

        a = student;
        // `a` now points to the NEW object.
        // IMPORTANT: Only `a` is changed here.
        // `x` is still pointing to the ORIGINAL object.
        // so above x.id output will be 1 only


    }
}

class Student{
    public int id;
}
