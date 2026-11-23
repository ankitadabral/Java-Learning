package Collection_Framework.Collection.List.Vector.Stack;

import java.util.Stack;

// STACK - It follows LIFO principle
// means last in first out
// Since Stack extends vector , it is synchronized making it thread safe

public class StackDemo {
    public static void main(String[] args) {

        //creating Stack
        Stack<Integer> stack = new Stack<>();

        // If we want to add items in stack then
        // we can use push method
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(9);
        stack.push(8);
        System.out.println("Printing stack after adding elements : " + stack);

        // We can remove elements from a stack by using pop method
        // this will remove the lastly added element and then goes on when we again call it
        System.out.println();
        Integer removedElement = stack.pop();
        System.out.println("Printing the removed element value by storing the stack.pop method outcome in an Integer type reference : "+ removedElement);
        System.out.println();
        System.out.println("Printing stack after removing element by using pop method : " + stack);

        //If we do not want to remove and just want to see or know that what is placed at the top of stack
        // Then we can use stack.peek method
        System.out.println();
        System.out.println("Printing the element which is placed at the top of the element just to see by using peek method : " +stack.peek() );

        // To check whether stack is empty or not
        // we can use stack.isEmpty method , it will return true or false
        System.out.println();
        System.out.println("Printing stack is empty or not : " + stack.isEmpty());

        //to check the size of stack we can use stack.size method
        System.out.println();
        System.out.println("printing size of stack by using size method : "+ stack.size());

        // We can also add or remove elements from a particular index in stack as well
        //This is because Stack extends Vector that's why it inherited all the methods present in vector
        System.out.println();
        stack.add(2,9);
        System.out.println("Printing stack after adding element at index 2 by using add method : ");
        System.out.println(stack);

        System.out.println();
        stack.remove(4);
        System.out.println("Printing stack after removing element 5 present at index 4 : ");
        System.out.println(stack);


        // We can also find that at which index the particular element is placed by using stack.search method
        //It will find the index of that element from the top of the stack (means the element which is lastly added)
        // And also indexing in search method of stack starts from 1 and not 0
        System.out.println();
        System.out.println("Printing the index at which element 9 is placed in stack : ");
        int search = stack.search(1); // it returns the index at which element is present
        System.out.println(search);

        System.out.println();
        System.out.println("Element 10 is not present in stack printing the value of stack.search for it : ");
        System.out.println(stack.search(10)); // It will return -1 if element is not found in stack


    }
}
