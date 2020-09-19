package Multithreading;

public class RunnableThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if(i==2)
            try {
                Thread.sleep(1000); //thread will sleep for 1000 milisec
                }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i + " " + Thread.activeCount() + " =thread count// " + Thread.currentThread()
                    .getPriority() + " =thread priority//  " + Thread.currentThread()
                    .getName() + " =name of thread");
        }
    }
}
