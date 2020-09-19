package JavaEight.DateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class TimePractice {

    public void printParseTime(){
        LocalTime localTime =LocalTime.parse("09:30"); //always give in 2 digits like 08
        System.out.println("input through parse method:- "+localTime);
    }
    public void printCurrentTime() {
        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime:- "+currentTime);
    }
    public void printOfTime(){
        LocalTime ofTime = LocalTime.of(1,3); //no need to give in 2 digit
        System.out.println("input through of method:- "+ofTime);
        LocalTime ofTimewithSec =LocalTime.of(1,20,4);
        System.out.println("input through of method eith sec:- "+ofTimewithSec);
    }
    public void printTime(){
        LocalTime printTime= LocalTime.now(ZoneId.of("IST"));
        System.out.println(printTime);
    }
    }
