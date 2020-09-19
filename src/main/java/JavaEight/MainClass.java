package JavaEight;

import JavaEight.FunctionalInterface.FunInterface;

public class MainClass {
    public static void main(String[] args) {
        FunInterface fi=()->{System.out.println("lambda expression");
        };

        SayableFun s=(name)-> ("hello " +name); //implementation of funinterface
        System.out.println(s.say("mk")); //method call

        SayableFun s1=(name)->{ String st1= "functional interface with "+name;
        String st2=st1 +" practice";
        return st2;
        };

        Calculate cl=(a,b)->(a+b);
        Calculate cl1=(a,b)->(a*b);
        System.out.println(cl.calculate(3,4));
        System.out.println(cl1.calculate(3,4));
        System.out.println(s1.say("Lambda expression"));
    }

}
