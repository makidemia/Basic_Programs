package JavaEight;

import java.util.ArrayList;
import java.util.List;

public class CheckClass {


    public static List giveAList() {
        List<String> listOfElemnt = new ArrayList<>();
        listOfElemnt.add("mk");
        listOfElemnt.add("pl");
        listOfElemnt.add("sk");
        return listOfElemnt;
    }

    public static void checkOptMethod() {
        List<String> newlist = giveAList();
        // boolean valuebool= LambdaCheck.optCheck(newlist,$-> true);

        newlist.stream().forEach($ -> LambdaCheck.optCheck(newlist, ele -> true));

        if (LambdaCheck.optCheck(newlist, $ -> true)) {
            System.out.println("hi");

            for (String str : newlist
            ) {
                str.contains("k");
                System.out.println("yes"+str);
            }
        }
    }

    public static void main(String[] args) {
        checkOptMethod();
    }
}
