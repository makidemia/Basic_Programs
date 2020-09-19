package Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

public void methodToCheckRegex() throws Exception{
    String firstNameRegex = "^[a-zA-Z]+$";
    Pattern pat = Pattern.compile(firstNameRegex);
    Matcher m = pat.matcher("Shra@fkk");
    System.out.println(m.matches());

    if (!m.matches()) {
        throw new Exception("Invalid data");
    }
}
    public static void main(String[] args) {
    RegexPractice regexPractice=new RegexPractice();
        try {
            regexPractice.methodToCheckRegex();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
