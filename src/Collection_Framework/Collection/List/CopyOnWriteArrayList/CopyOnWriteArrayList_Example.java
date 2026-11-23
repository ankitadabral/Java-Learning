package Collection_Framework.Collection.List.CopyOnWriteArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_Example {

    //here if we use Arraylist then in that case it will throw concurrentThread Modification error
    //but in case of CopyOnWriteArrayList it will not throw any error
    public static void main(String[] args) {
        List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("item3");

        //creating reader thread
        Thread readerThread = new Thread(()-> {
            try {
                while (true) {
                    for (String item : sharedList) {
                        System.out.println("reading item : " + item);
                    }
                }

            }catch (Exception e) {
                System.out.println("Exception in reader thread : " + e);
            }
        });

        // creating writer Thread
        Thread writerThread = new Thread(()-> {

            try {
                Thread.sleep(500);
                //adding Item4 in list
                sharedList.add("Item4");
                System.out.println("item4 added in the list.");

                //Removing Item1 from list
                sharedList.remove("Item1");
                System.out.println("Removed item1 from the list");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        });

        readerThread.start();
        writerThread.start();
        }

    }
