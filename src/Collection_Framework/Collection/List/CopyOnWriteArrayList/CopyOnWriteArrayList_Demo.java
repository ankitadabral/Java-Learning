package Collection_Framework.Collection.List.CopyOnWriteArrayList;

//Copy on Write means whenever a write operation(add, remove, set of element) happens
//instead of directly modifying the existing list
//A new copy of the list is created, and the modification is applied to that copy
// This ensures that other threads reading the list while its being modified are unaffected.

// Read Operations : Fast and direct, since they happen on a stable list without interference and modification.
// Write Operation : A new copy of the list is created for every modification.
              // The reference to the list is then updated so that subsequent reads use this new list .

// It should be used when there are more read operations and less write operation

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_Demo {
    public static void main(String[] args) {

        //Creating a shopping list
        CopyOnWriteArrayList<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("bread");
        System.out.println("Initial Sopping list : " + shoppingList);

        //ArrayList: If we add or remove an element while iterating over the list,
        // it may throw ConcurrentModificationException because its iterator is fail-fast.
        //CopyOnWriteArrayList: It does not throw this exception because its iterator reads a snapshot of the original list,
        // while modifications are made to a new copy.

        for(String item : shoppingList){
            System.out.println(item);
            if(item.equals("Eggs")){
                shoppingList.add("Butter");
                System.out.println("Added Butter while reading");
            }
        }
        System.out.println("Updated shopping list : " + shoppingList);

    }
}
