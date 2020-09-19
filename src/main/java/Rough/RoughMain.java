package Rough;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class RoughMain implements Car{

    public RoughMain(String nameOfVehicle, int noOfWheels, String vehicleType) {
        this.nameOfVehicle = nameOfVehicle;
        this.noOfWheels = noOfWheels;
        this.vehicleType = vehicleType;
    }

    public RoughMain(){
    }
    @Override
    public String toString(){
        return nameOfVehicle+" "+noOfWheels+" "+vehicleType;
    }

    String  nameOfVehicle;
    int noOfWheels;
    String vehicleType;

    @Override
    public void print(){
        System.out.println("i am a four wheeler");
    }

    @Override
    public Car returnObject(){
        Car car =new RoughMain();
        System.out.println(car);
        return car;
    }

    public Car returningInterface(){
        return returnObject();
    }

    public Car interfaceAsReturntype(){
        System.out.println("I am an interface returning method");
        System.out.println(this);
        return RoughMain.this;
    }

    public static void main(String[] args) {
       /* List<String> list = new ArrayList<>();
        list.add("1234");
        list.add("234");
        list.add("001");
        list.add("999");
        list.add("788");

        String elemnt = list.get(list.size()-2);
        System.out.println(elemnt);
    */

       RoughMain roughMain =new RoughMain("Scooty",2,"2wheeler");
       roughMain.returningInterface();
       //roughMain.returnObject();
    //   roughMain.interfaceAsReturntype();
    }
}
