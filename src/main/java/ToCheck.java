import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ToCheck {

    public String generateThreadName() {
        int number = (int) Math.random();
        String uniqueThreadName = new String("Thread");
        uniqueThreadName += number;
        return uniqueThreadName;
    }


    public String newNoThread() {
        Random random = new Random();
     long ts = new Date().getTime()+1;
        String threadname="Thread" + ts;

        return threadname;
       /* Set<String> allThreads= new HashSet<>();
        allThreads.add(threadname);
        System.out.println(allThreads);
        //if list already contains thread name then it should not return it
       if(allThreads.contains(threadname)){
        return threadname;}
       else return newNoThread();*/
    }

    public static void main(String[] args) {
        ToCheck toCheck = new ToCheck();


        //System.out.println(toCheck.generateThreadName());
        System.out.println("1 "+toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println("10 "+toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println("20 "+toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());
        System.out.println(toCheck.newNoThread());



    }
}
