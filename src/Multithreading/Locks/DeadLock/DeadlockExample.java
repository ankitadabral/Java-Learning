package Multithreading.Locks.DeadLock;

class Pen {

    // synchronized instance method:
    // The thread must acquire the lock of this Pen object before entering this method.
    // Only one thread can execute a synchronized method on the same Pen object at a time.

    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to use paper " + this);

        // Calls the synchronized method of Paper.
        // The current thread already has the Pen lock.  Now it tries to get the Paper lock.
        // If another thread already has the Paper lock,this thread has to wait.
        paper.finishWriting();
    }

    // synchronized method:
    // The thread needs the Pen object's lock to enter this method.
    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
    }
}

class Paper {


    // synchronized instance method:
    // The thread must acquire the Paper object's lock  before entering this method.
    public synchronized void writeWithPaperAndPen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to use pen " + this);

        // Calls the synchronized method of Pen.
        // The current thread already has the Paper lock.Now it tries to get the Pen lock.
        // If another thread already has the Pen lock,this thread has to wait.
        pen.finishWriting();
    }

    // synchronized method:
    // The thread needs the Paper object's lock to enter this method.
    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
    }
}

// Task1 implements Runnable.
// Runnable represents a task that can be executed by a Thread.

class Task1 implements Runnable {

    // Stores the reference of a Pen object.
    private Pen pen;

    // Stores the reference of a Paper object.
    private Paper paper;


    // Constructor of Task1. It receives Pen and Paper objects.
    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {

        // Calls the synchronized method of Pen.
        // Thread-1 will first acquire the Pen lock.
        // Then it will try to acquire the Paper lock.
        pen.writeWithPenAndPaper(paper); // thread1 locks pen and tries to lock paper

        // As due to above line in Task 1 the lock acquiring order is Pen--> Paper and in Task 2 the order is Paper---> Pen
        // due to which deadlock condition will appear as the lock acquiring order in all the thread is opposite
        // So to resolve this we need to do that the lock acquiring order of all the worker threads should be same
        // ex either Pen--->paper or paper--> pen for both
        // so we will change one line is Task 2
    }
}


class Task2 implements Runnable{

    // Stores the reference of a Pen object.
    private Pen pen;

    // Stores the reference of a Paper object.
    private Paper paper;

    // Constructor of Task2.
    public Task2(Pen pen, Paper paper){
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {

        // Calls the synchronized method of Paper.
        // Thread-2 will first acquire the Paper lock.
        // Then it will try to acquire the Pen lock.

        // If you want to see deadlock output then remove this synchronized block and then run
        synchronized(pen){ // this synchronized block we have added so that the order of lock acquiring by thread 2 willbe sam as thread 1
            // here to acquire lock of paper first thread 2 needs lock of pen
            // and in task the flow is already that first acquire pen lock and then paper
            // now as both the lock acquiring order is same deadlock is resolved

        paper.writeWithPaperAndPen(pen); //thread2 locks paper and tries to lock pen
    }
    }
}


public class DeadlockExample {
    public static void main(String[] args) {
        // Create a Pen object. "pen" stores the reference of this object.
        // This Pen object has its own lock.
        Pen pen = new Pen();


        // Create a Paper object."paper" stores the reference of this object.
        // This Paper object has its own lock.
        Paper paper = new Paper();

        // Create Thread-1.
        // new Task1(pen, paper)
        // → creates a Task1 object.
        // → passes the SAME Pen and Paper objects to Task1.
        // "Thread-1"
        // → gives the thread its name.
        Thread thread1 = new Thread(new Task1(pen, paper), "Thread-1");

        // Create Thread-2.
        // new Task2(pen, paper)
        // → creates a Task2 object.
        // → passes the SAME Pen and Paper objects to Task2.
        // "Thread-2"
        // → gives the thread its name.
        Thread thread2 = new Thread(new Task2(pen, paper), "Thread-2");


        thread1.start();
        thread2.start();

    }
}
