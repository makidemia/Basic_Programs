package stringDemo;

import Base.AccessSpecifier;
import Base.Inheritance;

public class StringBoolean extends AccessSpecifier {

public static void main(String args[])
{
    String s="my java programming";
    String sk=" java ";

    boolean status= s.contains(sk);
    boolean status1= s.equals(sk);
    boolean status2= s.equalsIgnoreCase(sk);


    System.out.println(status);
    System.out.println(status1);
    System.out.println(status2);

    AccessSpecifier as=new AccessSpecifier();
    as.pubSpecify();
    System.out.println(s);
}
    public void print() {

    }

    public void show() {

    }
}
