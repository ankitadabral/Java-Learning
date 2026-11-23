package Collection_Framework.Collection.List.Vector.Stack;

import java.util.LinkedList;

// To access stack we have two ways by using LinkedList class and Stack class
public class LinkedList_As_Stack_Example {
    public static void main(String[] args) {

        // creating a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        //In linked list addLast methods works similar to stack.push method
        //or
        linkedList.addLast(1); // stack.push
        linkedList.addLast(2); // stack.push
        linkedList.addLast(3); // stack.push

        // likedlist.getLast method is similar or equivalent to stack.peek method
        linkedList.getLast(); // stack.peek

        //linkedList.removelast is similar or equivalent to stack.pop
        linkedList.removeLast(); // stack.pop

        //linkedlist.size , linkedlist.isEmpty are same as stack.size and stack.isEmpty
        linkedList.size();  //stack.size
        linkedList.isEmpty(); // stack.isEmpty
    }
}
