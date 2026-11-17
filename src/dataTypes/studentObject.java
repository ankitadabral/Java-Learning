package dataTypes;

public class studentObject {

    public static void main(String[] args){

        student student = new student(); // here we are creating a object by using new keyword for which the heap memory gets allocated to that particluar object/value and "student" is just a reference variable which is pointing to the memory location or address/location of the object present in heap
        student.name = "Ankita Dabral";
        student. address = "India";
        student.standard = 12;
        student. rollNo = 05;
        System.out.println(student.name);
    }
}
