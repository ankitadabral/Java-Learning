package Multithreading.ThreadMethods;

// RUN, START, SLEEP, JOIN, setPriority, getState we have already studied it
// Now in this we are learning setPriority(), getName(), interrupt() method

public class Operations extends Thread {

    // Here we are creating parametrized constructor of this class and passing argument name
    // We can set the name of our thread by doing the below thing
    public Operations(String name){
                    // Thread class has a constructor that accepts the thread name.
        super(name);// super(name) calls the parent Thread class constructor and passes the name to it.
                   // This sets the name of the thread.


    }

    public void run() {   // 2. This is the run method
        for (int i = 0; i <=5; i++) {

            // We are doing some extra work inside the loop so that we can observe
// how thread priorities affect the execution/output of different threads.
            String a = "";
            for(int j =0; j<10000; j++){
                a+= "a";
            }

            System.out.println(Thread.currentThread().getName() + "-Priority: " + Thread.currentThread().getPriority() + "- count: " + i);

            try {
                Thread.sleep(1000);
                System.out.println("Thread is running.......");
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted: " + e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Operations t1 = new Operations("Veena");
        t1.start();
//interrupt() is a method of the Thread class used by one thread to send an interruption request to another thread, especially when the target thread is sleeping, waiting, or blocked orin any condition
        // here main thread is calling t1.interrupt to interrupt t1 thread
        //interrupt() sends a request to interrupt a thread, but it does not forcefully stop the thread.
        t1.interrupt();










      /* Uncomment below code to check the set priority method output with different threads



       // here we are creating 3 threads l, m, h
        Operations l = new Operations("Low Priority Thread");
        Operations m = new Operations("Medium Priority Thread");
        Operations h = new Operations("High Priority Thread");

        // We can also set the priority of thread by ourselves using set priority method
        l.setPriority(Thread.MIN_PRIORITY); // setting priority of Thread l
        m.setPriority(Thread.NORM_PRIORITY); // setting priority of Thread m
        h.setPriority(Thread.MAX_PRIORITY); // setting priority of Thread h

        // Now starting the threads
        //And in output we know that "Multiple threads with different priorities execute concurrently, and thread priority does not guarantee the execution order."
        l.start();
        h.start();
        m.start();

       */


    }
}
