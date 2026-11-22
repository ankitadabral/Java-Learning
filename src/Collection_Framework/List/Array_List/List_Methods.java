
package Collection_Framework.List.Array_List;

import java.lang.reflect.Field;
import java.util.*;

public class List_Methods {
    public static void main(String[] args) throws Exception {

        // we can write this by mentioning initial capacity as well
        // here we have given 11 it means arraylist will not grow until 11 capacity is used
        // by default arraylist size is 10
        // IMPORTANT:
        // Capacity means the length of the internal array.
        // Size means the actual number of elements present in the ArrayList.
        // ArrayList internally uses a dynamic array to store elements.
        // When we provide initial capacity as 11, Java creates an internal array of length 11.
        // This means it can store 11 elements without increasing its capacity.

        ArrayList<Integer> list = new ArrayList<Integer>(11);

        //OR we can also write as
        //List <Integer> list = new ArrayList<>();

        // Here List is an interface and ArrayList is its implementation class.
        // We can use the List reference to achieve abstraction.
        // This makes it easier to change the implementation later,
        // for example, from ArrayList to LinkedList.

        // if we want to add something in the list use list.add

        // Until and unless we will not add more than 11 elements in arraylist the capacity will not increase

        // add(element) inserts the element at the end of the ArrayList.
        // Each element gets an index, starting from 0.
        // Since we have provided initial capacity as 11,
        // adding up to 11 elements will not require capacity expansion.

        list.add(1);
        list.add(5);
        list.add(80);
        list.add(7);
        list.add(9);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(15);
        list.add(23);
        list.add(76);

        // NOTE this is not imp just for knowledge purpose : We cannot directly print the capacity value of an Arraylist
        // but we can use reflection to do so

        // Reflection allows us to access class information and members at runtime.
        // Here we are accessing the private internal array named "elementData"
        // inside the ArrayList class.
        // This is only for learning purposes. We should not use reflection
        // to access ArrayList's internal implementation in normal application code.

        Field field = ArrayList.class.getDeclaredField("elementData");

        // setAccessible(true) allows us to access a private field using reflection.
        // Note: On newer Java versions, module access restrictions may prevent this.
        // In that case, JVM may require an --add-opens option.

        field.setAccessible(true);

        // get(list) retrieves the value of elementData from our list object.
        // Since elementData is an Object array, we type-cast it to Object[].
        // elementData.length gives us the actual internal array capacity.

        Object[] elementData = (Object[]) field.get(list);

        System.out.println("ArrayList capacity when there are only 11 elements: " + elementData.length);
        System.out.println();

        // and when we add only one element more than 11 then the capacity of arraylist will grow

        // We are adding the 12th element.
        // Since the existing internal array can store only 11 elements,
        // ArrayList creates a bigger internal array and copies the old elements into it.
        // In standard OpenJDK implementations, the new capacity is generally 1.5 times
        // the old capacity (11 + 11/2 = 16).

        list.add(55);
        //again printing capacity
        // We are accessing elementData again because the internal array may have changed
        // after adding the 12th element.

        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity after adding 12th element: " + elementData.length);

        // if we want to get something use list.get(index)
        // get(index) returns the element present at the specified index.
        // ArrayList uses zero-based indexing, which means the first element is at index 0.
        // If we try to access an invalid index, Java throws IndexOutOfBoundsException.

        System.out.println();
        System.out.println();
        System.out.println("Printing value present at index 0 by using .get method : " +  list.get(0)); // return 1
        System.out.println();
        System.out.println("Printing value present at index 1 by using .get method : " +   list.get(1)); // return 5
        System.out.println();
        System.out.println("Printing value present at index 2 by using .get method : " +   list.get(2)); // return 80
        //System.out.println(list.get(3)); // gives exception

        // if we want to find size then use list.size()
        // size() returns the actual number of elements present in the ArrayList.
        // It does NOT return the internal array capacity.
        // Currently, the list contains 12 elements.
        System.out.println();
        System.out.println();
        System.out.println(" Printing size of list : " + list.size());
        System.out.println();
        System.out.println();

        // if we want to print complete list then use for loop
        // Traditional for loop:
        // We use the index to access each element using list.get(i).
        // This is useful when we need both the element and its index.

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Printing list by using for loop : " + list.get(i));
        }

        //method to remove elements from list : list.remove(index)
        // remove(index) removes the element present at the specified index.
        // All elements after that index shift one position to the left.
        // This method returns the element that was removed.
        // Here, the element at index 1 (value 5) will be removed.
        System.out.println();
        System.out.println();
        System.out.println("printing value of index 1 which is removed by using .remove method : "+ list.remove(1));

        System.out.println();
        System.out.println();

        // if we want to print complete list then use for each loop
        // Enhanced for loop / for-each loop:
        // It directly iterates over each element without using an index.
        // It is useful when we only need to read or process elements.
        // We cannot directly access the index using this loop.

        for (int x : list) {
            System.out.println("printing list by using for each loop : " + x);
        }

        // method to check the existence : list.contains(element)
        // contains(element) checks whether the given element exists in the list.
        // It returns true if the element is present; otherwise, it returns false.
        // Here, 5 was removed earlier, so contains(5) returns false.
        // contains() uses equals() internally to compare elements.
        System.out.println();
        System.out.println("Printing whether list contains 5 or not using .contains method : "+ list.contains(5));//false as above we have used list.remove and removed index1 value
        System.out.println();
        System.out.println("Printing whether list contains 40 or not using .contains method : " + list.contains(40)); //false



        //method to add elements at particular index or between other two elements
        // add(index, element) inserts an element at the specified index.
        // The existing element at that index and all elements after it
        // shift one position to the right.
        // Here, 60 will be inserted at index 1.
        list.add(1, 60);

        // toString() is automatically called when we print an object using println().
        // ArrayList overrides toString() to display its elements in readable format.
        // Therefore, we can print the complete list directly without using a loop.
        System.out.println();
        System.out.println();
        System.out.println(list); // output : 1, 60, 80 as we have added 60 at index1


        // method to add elements at particular index or between other two elements
        // set(index, element) replaces the existing element at the specified index.
        // Unlike add(index, element), it does NOT shift the other elements.
        // It returns the previous element that was replaced.
        // Here, the value at index 2 (80) will be replaced with 45.
        list.set(2, 45);
        System.out.println();
        System.out.println();
        System.out.println("Printing list by adding 1 value at index 2 using set method : " + list); // output : 1, 60, 45 as we have set 60 at index 2


        // Arraylist capacity will not shrink automatically and if we want to do so
        // then we can use list.trimToSize() method
        // trimToSize() reduces the internal array capacity to match the current list size.
        // For example, if size is 12 and capacity is 16,
        // trimToSize() reduces the capacity to 12.
        // This can help avoid unused internal array space.
        list.trimToSize(); // it will trim the array to its size means capacity = size


        ///  MORE WAYS TO CREATE A ARRAYLIST

        // 1st Way

        // Here we are creating an empty ArrayList using the List interface reference.
        // The actual object is still an ArrayList.
        // We can add, remove, update and retrieve elements normally.

        List<String> list1 = new ArrayList<>();

        // getClass() returns the runtime class of the object.
        // getName() returns the fully qualified class name.
        System.out.println();
        System.out.println();
        System.out.println("Printing list1 with class name : "+ list1.getClass().getName());

        // 2nd Way
        // Arrays.asList() creates a fixed-size list backed by the given array.
        // We can update existing elements using set().
        // However, we cannot add or remove elements because the list has a fixed size.
        // It is not an ArrayList; it is a list implementation returned by Arrays.

        List<String> list2 = Arrays.asList("Monday", "Tuesday");
        System.out.println();
        System.out.println();
        System.out.println("Printing List2 with Class name : " +list2.getClass().getName());

        // set(index, element) replaces the existing element.

        list2.set(1, "Wednesday");
        System.out.println();
        System.out.println();
        System.out.println("Value present at index1 of List2 (example of .set method in Array.aslist : " + list2.get(1));
        //list.add method will not work for it will give run time error
        // add() and remove() will throw UnsupportedOperationException
        // because Arrays.asList() returns a fixed-size list.
        // list2.add("May"); XX


        //3rd Way
        // First, we create a normal String array.
        // Arrays.asList(array) converts the array into a fixed-size List.
        // The returned list is backed by the original array.
        // This means changes made through the array or list are reflected in each other.

        String[] array = {"Apple", "Peach", "Cherry","Tomato","Potato"};
        List<String> list3 = Arrays.asList(array);
        System.out.println();
        System.out.println();
        System.out.println("List3 (Example of list creation with Array.aslist + get class name :" + list3.getClass().getName());

        //We can make above list modifiable by using below
        List<String> list5 = new ArrayList<>(list3);

        //and after this we can add and remove element
        list5.add("mango");

        System.out.println();
        System.out.println();

        System.out.println("List5 (example of modifiable Array.aslist method: )" +list5);

        // 4th way
        //create by using list.of it will create unmodifiable list
        List<Integer> list4 = List.of(1, 2, 3, 4, 5);

        // means here replace any element is also not possible
        // list4.set(1, 5) XX

        //creating a new array list
        List<Integer> list6 = new ArrayList<>();

        list6.add(7);
        //now we are using list.addAll() method
        // in this we can give a collection
       list6.addAll(list4);
        System.out.println();
        System.out.println();
        System.out.println("List6 (Example of add all method)"+ list6); // it will print all the value present in list4
        // as well the value present in list 6


        //list.remove(object) method for strings value
        System.out.println();
        System.out.println();
        System.out.println("Removing Tomato from list5 by using remove method (return true or false) : " + list5.remove("Tomato")); // in case of string if we write the actual value then it will take as object
        //means it will remove the actual object

        System.out.println();
        System.out.println("Removing value of index 5 from list5 by using remove method : " + list5.remove(1)); // in case of string if we write as 0,1,2 .. then it will treated as index
        // so that particular index value will be removed
        System.out.println();
        System.out.println();
        System.out.println("List5 (example after applying  remove method for string value ) :"+ list5);


        //list.remove(object) method for Integer value
        System.out.println();
        System.out.println();
        System.out.println("Printing value of index 1 from list6 which is removed by using remove method : "+ list6.remove(1));
        System.out.println();
        System.out.println("Printing value which get removed by using remove method of value : "+ list6.remove(Integer.valueOf(5)));
        System.out.println();
        System.out.println("Printing list6 after using remove method : "+ list6);

        // METHOD TO CONVERT A LIST INTO AN ARRAY
        Integer[] array1 = list6.toArray(new Integer[0]);
        //and if the list contains string then replace Integer with String
        System.out.println();
        System.out.println("Printing List 6 by converting it into an array by using .toArray method  "+ list6);

        // METHOD TO SORT A ARRAYLIST/LIST
        Collections.sort(list6); // This is one method

        list6.sort(null);  // We can also sort directly by using this
        // here null means sort in natural order or default order

        System.out.println();
        System.out.println("Printing the sorted list6 by using collections.sort method : "+list6);


    }
}
