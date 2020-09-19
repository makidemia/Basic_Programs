package JavaEight.FunctionalInterface;

import JavaEight.FunctionalInterface.FuncInterface;

import java.util.ArrayList;

public class LamdaPractice {

    void m1(){
        String s="mak";
        for(int i=s.length();i<=2;i--){
            System.out.println(i);
        }
    }

    public static void main(String[] args){

        FuncInterface f=(int x)-> System.out.println(x*x);
        f.func(5);

        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        arrL.forEach(r-> System.out.println(r));


    }


}
