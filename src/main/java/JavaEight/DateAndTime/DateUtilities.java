package JavaEight.DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateUtilities {

    public void dateUtilitiesForDays() {
        LocalDate tommorow = LocalDate.now().plusDays(1);
        LocalDate dayAfterTommorow = LocalDate.now().plusDays(2);
        LocalDate yesterday = LocalDate.now().minusDays(1);
        LocalDate dayB4Yesterday = LocalDate.now().minusDays(2);
        System.out.println("tommorow is: " + tommorow
                + " dayAfterTommorow is: " + dayAfterTommorow
                + " yesterday: " + yesterday
                + " dayB4Yesterday : " + dayB4Yesterday);
        System.out.println();
    }

    public void dayOfWeek() {
        LocalDate day = LocalDate.ofYearDay(2019, 10);
        System.out.println("Day input without month:- " + day);
        System.out.println();

        DayOfWeek dayOfWeek = LocalDate.parse("1996-02-10").getDayOfWeek();
        System.out.println("DayOf week is: " + dayOfWeek);
        System.out.println();

        int dayOfmonth = LocalDate.now().getDayOfMonth();
        System.out.println("Day of the month as in number:- " + dayOfmonth);
    }

    public void dateBefore(int yy, int mm, int dd) {
        Boolean isBefore = LocalDate.of(yy, mm, dd).isBefore(LocalDate.of(2019, 02, 01));
        if (isBefore) {
            System.out.println("befor mentioned date");
        } else System.out.println("after mentioned date");
    }

    public void dateAfter(int yy, int mm, int dd) {
        Boolean isAfter = LocalDate.of(yy, mm, dd).isAfter(LocalDate.of(2018, 12, 01));
        if (isAfter) {
            System.out.println("after the date mentioned");
        } else System.out.println("befor date");
    }

    public void withinLimit(int yy, int mm,int dd){
        boolean isInB4Limit = LocalDate.of(yy,mm,dd).isBefore(LocalDate.parse("2019-02-01"));
        boolean isInAfterLimit =LocalDate.of(yy,mm,dd).isAfter(LocalDate.parse("2019-01-01"));

        if(isInAfterLimit && isInB4Limit){
            System.out.println("within limits"+LocalDate.of(yy,mm,dd));
        }
        else {System.out.println("out of limits"+LocalDate.of(yy,mm,dd));
    }}

}

