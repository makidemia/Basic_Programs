package ReflectionPractice;

import Base.InterfaceClass;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionPractice {

    CityInfo cityInfo = new CityInfo();


    public void getClassName() {
        Class class1 = cityInfo.getClass();
        System.out.println("class name is: " + class1);
        System.out.println();
    }

    public void getMethodsName() {
        Method[] methods = cityInfo.getClass().getMethods();
        Arrays.stream(methods).forEach(System.out::println);
        System.out.println();
        try {
            Method methods1 = cityInfo.getClass().getDeclaredMethod("toString", null);
            System.out.println();
            System.out.println(methods1);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
     AnnotatedType[] annotatedInterfaceClass= cityInfo.getClass().getAnnotatedInterfaces();
        System.out.println(annotatedInterfaceClass);
    }


    public void getObject() {
        try {
            Object o = Class.forName("ReflectionPractice.CityInfo").newInstance();
            System.out.println();
            System.out.println("INITIAL VALUES OF OBJECT: " + o);
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {

        }
    }

    public static void main(String[] args) {
        CityInfo cityInfo = new CityInfo("Pune", 2233, "magarpatta", "Daffodils", 550);

      /*  try{
            Object refPrac = Class.forName("ReflectionPractice").newInstance();

        }
        catch(IllegalAccessException | InstantiationException | ClassNotFoundException e){
            e.printStackTrace();
        }*/
        ReflectionPractice reflectionPractice = new ReflectionPractice();
        reflectionPractice.getClassName();
        reflectionPractice.getMethodsName();
        reflectionPractice.getObject();


    }

}
