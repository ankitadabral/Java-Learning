package Collection_Framework.Collection.List.Vector;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

// Vector is a legacy synchronized collection class that implements list interface
// IMPORTANT - VECTOR are thread safe(synchronization is there) it use internally synchronized keywords with its method
// it means only one thread can access the methods at a time
//So In java arraylist is generally preferred over vectors when synchronization is not required
//And for thread safe purpose the copyOnwriteArraylist or ConcurrentHashmap is used

public class VectorDemo {
    public static void main(String[] args) {
        // Creating vector
        Vector<Integer> vector = new Vector<>(5, 3);
        // By default, capacity of vector is 10 same as arraylist
        // And here if we add 1 more element then the initial capacity then the vector size increased to double
        // unlike an array list where size gets increased 1.5x

        // we can use add method to add elements in vector
        vector.add(1);
        vector.add(8);
        vector.add(7);
        vector.add(0);
        vector.add(4);

        System.out.println("Printing vector after adding elements by using add method : " + vector);
        // In vector there is a method to fetch the capacity of vector i.e.vector.capacity
        // unlike array list where there is no such method
        System.out.println();
        System.out.println("Printing capacity of vector by using capacity method : " + vector.capacity());

        //now when we add any other element after filing the initial capacity of vector
        // then by default its size increased to double
        // but if we want specification for the increment then
        // we can do so by adding the capacity increment value in vector creation line
        //and after doing this now we are adding 1 more element than checking
        // the capacity will be increased by +3

        //Note : every time when we add more element that capacity than its capacity will increased
        //by the value which we have defined at capacity increment value


        vector.add(9);
        System.out.println();
        System.out.println("printing vector after adding 1 more content than the initial capacity : ");
        System.out.println(vector);
        System.out.println();
        System.out.println("printing vector capacity after adding 1 more element than the initial capacity: " + vector.capacity());

        // we can also create a vector by providing existing Linked list or arraylist collection
        // creating linked list by giving arraylist collection
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 7, 9, 7, 3, 4));

        // Now we will create vector by passing linked list collection
        Vector<Integer> vector1 = new Vector<>(linkedList);
        System.out.println();
        System.out.println("Printing vector1 created by passing linked list collection : ");
        System.out.println(vector1);

        // We can also print vector by using for loop
        System.out.println();
        System.out.println("Printing vector1 by using for loop : ");
        for (int i = 0; i < vector1.size(); i++) {
            System.out.println(vector1.get(i));
        }

        // We can also use clear method to remove all the elements from a vector
        // this method is applicable on Arraylist and Linked list as well

        vector1.clear();
        System.out.println();
        System.out.println("printing vector1 after using clear method : " + vector1);

    }
}


