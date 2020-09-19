package Multithreading;

public class MainThread {


    public static void main(String[] args) {
        //Create c = new Create();
        //c.start();
        System.out.println("main class thread");
        Runnable runThread = new RunnableThread();  //ref obj of a thread which is created from
        Thread t1 = new Thread(runThread);            //thread born
        Thread t2 = new Thread(runThread, "my thread");
        t1.start(); //started and it will call run method of the class whose thread is this
        //t1.start() // is will give an exception illegalThreadStateException
        t2.start();

        /* Create class run method using extending Thread class */
        Create create = new Create();
        Thread createThread = new Thread(create); // thread creation of a runnable class
        createThread.start(); // calling the run method from Create class
        Thread createThread2 = new Thread(create);
        createThread2.start();

    }
}
