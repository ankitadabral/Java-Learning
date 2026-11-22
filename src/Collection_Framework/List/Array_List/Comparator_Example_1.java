package Collection_Framework.List.Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//COMPARATOR is used for custom sorting of list
//Comparator is an interface which contains compare method that take two arguments (objecct)
//And compare these object of same type and determines the output
//so to use this compare method we need to make a class which implements comparator


// We have created below class for string list comparison
class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) { //inside this we have to write our sorting logic
        //that in which manner we want to sort

        // here we have used .length method to find string length and then subtract it,
        // and we are sorting in descending order
        //means the word which have more strings will come at first place
        return s2.length()-s1.length();
    }
}


// We have created below class for Integer list comparison
class IntegerComparator implements Comparator<Integer> {

    // this int decides the manner that which number will come in first place and then after
    // if int comes -ve (number) then o1 will come before o2
    // if int come +ve (number)  then o2 will come before o1
    // if int comes 0 then treat o1 and o2 both same in order

    @Override
    public int compare(Integer o1, Integer o2) {
        // here we have return o2-o1 because we want to sort the list in descending order
        //ex - 4-3= 1 +ve 4 will come before 3
        // and 3-4 = -1 -ve 4 will come before 3

        return o2 - o1;// it will sort list in descending order
        // and if we want in ascending order then we should write "return o1-o2"
    }
}

public class Comparator_Example_1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(8);
        list.add(0);
        list.add(7);

          list.sort(new IntegerComparator());
          System.out.println("Printing Integer list after sorting in descending order by using Comparator: "+ list);

        //IMPORTANT
        // We can also do this whole thing by using lambda expression in just 1 line
        // then in that case we do not need to create a separate class and implement comparator
        // as .sort accepts comparator
        // To check this you have to comment out below-mentioned two lines
        //and also comment out the whole code of separate class which we have created to override compare method

        /*
        list.sort((a, b) ->  b-a);
        System.out.println("Printing Integer list after sorting in descending order by using Comparator: "+ list);
         */


        List<String> words = Arrays.asList("Banana", "Apple","Peach","Date", "Pie");
        words.sort(new StringLengthComparator());
        System.out.println();
        System.out.println("Printing String list after sorting in descending order by using Comparator: " + words);


        //IMPORTANT
        // To check the lambda expression way of sorting for Strings  you have to comment out below-mentioned two lines
        //and also comment out the whole code of separate class which we have created to override compare method

        /*
        list.sort((a, b) ->  b.length()-a.length());
        System.out.println("Printing Integer list after sorting in descending order by using Comparator: "+ list);
         */


    }
}
