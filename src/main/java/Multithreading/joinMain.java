package Multithreading;

public class joinMain {

    public static void main(String[] args) {
        Thread thread1 =new Thread(new SleepThread());
       thread1.start();
        try {
            thread1.sleep(6000);
        }
        catch (InterruptedException e ){
            e.printStackTrace();
        }
        Thread thread2 =new Thread(new SleepThread());
        thread2.start();
    }
}
