package Collection_Framework.List;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class List_Basics {
    public static void main(String[] args) throws Exception{
        // we can write this by mentioning initial capacity as well
        // here we have given 1000 it means arraylist will not grow until 11 capacity is used
        // by default arraylist size is 10
        ArrayList <Integer> list = new ArrayList<Integer>(11);
        //OR we can also write as
        //List <Integer> list = new ArrayList<>();

        // if we want to add something in the list use list.add
        // Untill and unless we will not add more then 11 elements in arraylist the capacity will not increas
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
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity when there are only 11 elements: " + elementData.length);


        // and when we add only one element more than 11 then the capacity of arraylist will grow
        list.add(55);

        //again printing capacity
        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity after adding 12th element: " + elementData.length);


        // if we want to get something use list.get(index)
        System.out.println(list.get(0)); // return 1
        System.out.println(list.get(1)); // return 5
        System.out.println(list.get(2)); // return 80
        //System.out.println(list.get(3)); // gives exception

        // if we want to find size then use list.size()
        System.out.println(list.size());

        // if we want to print complete list then use for loop
        for( int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //method to remove elements from list : list.remove(index)
        System.out.println(list.remove(1));

        // if we want to print complete list then use for each loop
        for(int x : list){
            System.out.println(x);
        }

        // method to check the existence : list.contains(element)
        System.out.println(list.contains(5));//false as above we have used list.remove and removed index1 value
        System.out.println(list.contains(40)); //false

        //method to add elements at particular index or between other two elements
        list.add(1,60); // here 60 will be added in index 1 and previous index 1 value will be shifted to index 2

            System.out.println(list); // output : 1, 60, 80 as we have added 60 at index1

        // method to add elements at particular index or between other two elements
        list.set(2,45); // here 45 will be replaced with the previous value of index 2 rather then shifting the value

            System.out.println(list); // output : 1, 60, 45 as we have set 60 at index 2


        // Arraylist capacity will not shrink automatically and if we want to do so
        // then we can use list.trimToSize() method
        list.trimToSize(); // it will trim the array to its size means capacity = size






    }
}
