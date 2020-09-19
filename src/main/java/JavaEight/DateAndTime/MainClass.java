package JavaEight.DateAndTime;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        DateAndTimePractice dateAndTimePractice = new DateAndTimePractice();

       /* dateAndTimePractice.presentDate();
        dateAndTimePractice.printDate();

        Scanner input = new Scanner(System.in);
        System.out.println("enter the date in format yy-mm-dd:");
        String yourDate = input.nextLine();
        dateAndTimePractice.inputDate(yourDate);

        System.out.println("enter the date in integer format yy,mm,dd:");
        Scanner intInput = new Scanner(System.in);
        System.out.println("Enter year:");
        Integer year = intInput.nextInt();
        System.out.println("Enter month:");
        Integer month = intInput.nextInt();
        System.out.println("Enter day:");
        Integer day = intInput.nextInt();
        dateAndTimePractice.inputIntDate(year, month, day);
*/

        TimePractice timePractice = new TimePractice();
        timePractice.printParseTime();
        timePractice.printCurrentTime();
        timePractice.printOfTime();
        //timePractice.printTime();
        System.out.println();

    }
}