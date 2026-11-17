package Multithreading.ThreadMethods;

//yield() is a static method that gives a hint to the thread scheduler that the current thread is willing to give other threads a chance to execute.
//yield() is a static method of the Thread class.
//It is used by the currently running thread.
//It gives a hint/request to the thread scheduler to allow other threads to execute.
//The current thread may temporarily give up its CPU time.
//It can give other threads a chance to execute.
//yield() does not pause the thread for a specific amount of time.
//yield() does not guarantee that another thread will execute immediately.
//After yielding, the same thread can be selected by the scheduler again.

public class YieldMethod extends Thread{

    public YieldMethod(String name){
        super(name);
    }
    public void run(){
        for(int i =0; i< 5; i++){
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();// Gives a hint to the scheduler to give another thread a chance to execute.
        }
    }



    public static void main(String[] args) {
        YieldMethod t1 = new YieldMethod("t1");
        YieldMethod t2 = new YieldMethod("t2");
        t1.start();
        t2.start();


    }

}


