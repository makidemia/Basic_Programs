package JavaEight.DateAndTime;

import java.util.Scanner;

public class UtilityMain {
    public static void main(String[] args) {
      /*  DateUtilities dateUtilities = new DateUtilities();
        dateUtilities.dateUtilitiesForDays();
        dateUtilities.dayOfWeek();
        dateUtilities.dateBefore(2019, 03, 19);
        dateUtilities.dateBefore(2018, 03, 19);
        dateUtilities.dateAfter(2019, 03, 19);
        dateUtilities.dateAfter(2019, 01, 19);

        dateUtilities.withinLimit(2019, 01, 19);
        dateUtilities.withinLimit(2019, 02, 19); // exceeding date

*/
        PeriodPractice periodPractice = new PeriodPractice();
        Scanner read = new Scanner(System.in);
        System.out.println("enter your birthdate:");
        String date = read.nextLine();
        periodPractice.yearsFromYourBirth(date);
        periodPractice.durationSpentFromYourBirth(date);
    }
}
