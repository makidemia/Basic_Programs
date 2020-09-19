package JavaEight;

import JavaEight.FunctionalInterface.FunInterface;

public class ImplementingClass implements FunInterface, Calculate {


    @Override
    public void method1() {
        System.out.println("functional interface method ");
    }


    @Override
    public int calculate(int a, int b) {
        return a*b;
    }

}
