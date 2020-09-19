package Multithreading;

public class SleepThread implements Runnable {

    @Override
    public void run(){

        for (int i=0;i<=5;i++){

            System.out.println(" "+i);
        if (i==2)
            try{
                Thread.sleep(8000);
                System.out.println("thread goes to sleep");}
        catch (InterruptedException e){
                e.printStackTrace();
        }
            }

        System.out.println("use it as a thread");

    }


}
