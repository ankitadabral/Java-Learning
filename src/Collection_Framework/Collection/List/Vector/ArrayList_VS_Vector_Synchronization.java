package Collection_Framework.Collection.List.Vector;

// As we know Arraylist is not synchronized and thread safe
// And vector are thread safe and synchronized
// So we can check this by below-mentioned example

import java.util.ArrayList;

public class ArrayList_VS_Vector_Synchronization {

    // This code is for Array list
    // If you want to check for vector  than
    // just change the below-mentioned line by changing ArrayList to vector,
    // and you will be able to see synchronized output

    public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();

    //Creating thread 1
    Thread t1 = new Thread(()-> {
        for (int i=0; i<=1000; i++){
            list.add(i);
        }
    });

    //Creating thread 1
    Thread t2 = new Thread(()-> {
        for (int i=0; i<=1000; i++){
            list.add(i);
        }
    });

    t1.start();
    t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

        System.out.println("Printing size of list after adding elements by thraed1 and thread 2 : " + list.size());
    }
}
