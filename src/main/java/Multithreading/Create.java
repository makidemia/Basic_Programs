package Multithreading;
//extending thread class
public class Create extends Thread{

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+" this is the thread "+Thread.currentThread().getName());
        }
        System.out.println("Through thread class");

    }
    }



