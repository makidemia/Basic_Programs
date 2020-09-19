package JavaEight.DateAndTime;

import java.time.*;
import java.util.Date;

public class PeriodPractice {

    public void yearsFromYourBirth(String yourBirthDate) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(yourBirthDate);
        Period pd = Period.between(today, birthDate);
        System.out.println("you have lived :" + pd);
    }

    public void durationSpentFromYourBirth(String yourBirthDate) {
        LocalTime currentTime = LocalTime.now();
        LocalTime birthTime = LocalTime.of(04, 30);
        System.out.println(Duration.between(currentTime, birthTime));

        LocalDateTime currentLocalDateTime = LocalDateTime.now();
        LocalDateTime birthDateAndTime = LocalDateTime.of(LocalDate.parse(yourBirthDate), LocalTime.of(04, 30));
        Duration timeDurationSinceBirth = Duration.between(currentLocalDateTime, birthDateAndTime);
        System.out.println("duration since your birth is:- " + timeDurationSinceBirth);
    }

    public void localDtAndTimeInitialization(){
        LocalDateTime localDateTime =LocalDateTime.of(1996,Month.APRIL,30,12,30,10);
        LocalDateTime localDateTime1 =LocalDateTime.parse("2015-02-20T06:30:00");
    }


}
