package ExceptionHandling;

import java.util.Scanner;

public class SampleException {


    private int num;


    public void exceptionHandle() {

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        try {
            int newNum = num / inputNum;
            System.out.println(newNum + " executed");
        } catch (Exception e) {
            System.out.println("catch block handling exception");
            e.printStackTrace();
        } finally {
            System.out.println("finally block always execute");
        }
    }
}
