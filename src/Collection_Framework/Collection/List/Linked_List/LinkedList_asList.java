// Below mentioned is the format to create LINKED LIST but in java we have
//LINKED LIST class so we donot have to do all this we can simply use that clas

/*
public class Test {
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        node1.value = 1;
        node2.value = 2;
        node1.next = node2;
        node2.next = null;

    }
}

class Node{
    // this data is the integer value which is for the value part in the linked list
    public int value;

    // this pointer stores the reference of next node that's why it is Node type means object or reference
    public Node next;
}

 */
package Collection_Framework.Collection.List.Linked_List;

import java.util.Arrays;
import java.util.LinkedList;

// In java collection framework the LinkedList is doubly linked list implementation
public class LinkedList_asList {
    public static void main(String[] args) {

        // We can also create LinkedList by below way
        // List<Integer> list = new LinkedList<>();
        // but in that case we can only access the methods present in list interface
        // as the reference is of List interface (parent class)
        LinkedList<Integer>  list = new LinkedList<>();
        // We can simply use add /get method to add and fetch elements in linked list
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(9);
        list.add(13);

        // we can also add elements in the middle of list by using add(Index, element methos)
        list.add(2,34);
        System.out.println("Printing linkedlist by adding numbers using add method : " + list);
        System.out.println();
        System.out.println("Printing elements present at 3 index using get method : " + list.get(3)); //time complexity - O(n)

        //In liked list we also have add first and add last method
        // //to add elements at first and last position
        list.addFirst(0); // Time complexity - O(1)
        list.addLast(20); // O(1)
        System.out.println();
        System.out.println("printing linkedList by adding elements at first and last position of linked list by using addFirst/addlast method : ");
        System.out.println(list);


        // And same we also have get first and get last method
        //to fetch the elements present at the first and last position of list
        System.out.println();
        System.out.println( "Printing element present at first position by using getFirst method : "+ list.getFirst());
        //Time complexity O(1)
        System.out.println( "Printing element present at last position by using getLast method : "+ list.getLast());

        //In liked list we can remove a element from a particular index by using remove method
        System.out.println();
        System.out.println("Printing the element present at index 3 which we are removing by using remove method : ");
        System.out.println(list.remove(3)); // O(n)

        // Linked list also contain a method removeIf() it allows us to give a condition whose output will be true or false
        // and based on the output the elements will be removed from list
        // it accepts predicate which means condition
        System.out.println();
        list.removeIf(x-> x % 2 == 0); // if we print this it will return true or false
        System.out.println("Printing the list after removing elements which gets removed by matching the condition of removeIf method : ");
        System.out.println(list);


        // In liked list and array list both  there is one more method which is removeAll() it accepts a collection
        // It works as below-mentioned way
        System.out.println();
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Dog", "rat", "Cat", "tiger", "Lion"));
        LinkedList<String> animalsToRemoved = new LinkedList<>(Arrays.asList("tiger","rat"));
        animals.removeAll(animalsToRemoved);
        System.out.println("Printing animals Linkedlist after removing elements by using removeAll method : ");
        System.out.println(animals);



    }
}
