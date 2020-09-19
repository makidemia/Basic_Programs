package JavaEight.DateAndTime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateAndTimePractice {
    int year;
    int month;
    int day;

    public void presentDate() {
        LocalDate todaysDate = LocalDate.now();
        System.out.println(todaysDate);
    }

    public void printDate() {
        LocalDate printDate = LocalDate.of(2019, 2, 10);
        System.out.println(printDate);
    }

    public void inputDate(String yourDate) {
        LocalDate inputDate = LocalDate.parse(yourDate);
        System.out.println("your input date is:" + inputDate);
    }

    public void inputIntDate(int yy,int mm, int dd){
        this.year=yy;
        this.month=mm;
        this.day=dd;
        LocalDate localDate=LocalDate.of(yy, mm, dd);
        System.out.println(localDate);
    }
}
