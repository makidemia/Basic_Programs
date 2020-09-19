package langPackage;

import java.lang.reflect.*;

public class ObjectDemo {

    static int count=0;
    Class[] clazz;

    public static void main(String[] args) throws ClassNotFoundException {

        Class c= Class.forName("java.lang.Object");
       //Class[] clazz=c.getClasses();
        Method[] m1=c.getDeclaredMethods();

        for(Method m:m1) {
            count++;
            System.out.println("method in Object class... " +m.getName());
         //    System.out.println("classes in Object"+clazz.);
            System.out.println("no. of methods" + count);
        }
    }

}
