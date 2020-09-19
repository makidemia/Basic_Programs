package Multithreading;

public class ThreadSync implements Runnable {
    int count = 0;

    public void run() {
        synchronized (this){
            addOneWhenInvoked();
        }
    }

    public void addOneWhenInvoked() {
        count++;
        System.out.println("value of count :- " + count+" "+Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        ThreadSync threadSync = new ThreadSync();
        Thread thread1 = new Thread(threadSync);
        thread1.start();
        Thread thread2 = new Thread(threadSync);
        thread2.start();
        Thread thread3= new Thread(threadSync);
        thread3.start();
    }
}
