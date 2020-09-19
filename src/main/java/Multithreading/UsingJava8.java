package Multithreading;

public class UsingJava8 {


    public static void main(String[] args) {
       /* Runnable runnable = () -> {
            System.out.println("I am a thread " + Thread.currentThread().getName());
        };

        Runnable runnable1 = () -> Thread.currentThread().setDaemon(true);
*/
        Runnable runnable2 = () -> {
            for (int i = 0; i < 8; i++) {
                System.out.println( Thread.currentThread().getName()+" "+i);
            }
        };
        Thread t2 = new Thread(runnable2);
        t2.setName("thread-A");
        t2.start();
        Thread t3 =new Thread(runnable2);
        t3.setName("thread-B");
        t3.start();
        Thread t4 =new Thread(runnable2);
        t4.setName("thread-C");
        t4.setDaemon(true);
        t4.start();


    }

}
