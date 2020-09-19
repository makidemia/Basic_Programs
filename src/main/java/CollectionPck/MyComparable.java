package CollectionPck;

import java.util.ArrayList;
import java.util.List;

public class MyComparable {
    String name;
    int rollno;
    int age;

    MyComparable(String name,int rollno,int age)
    {
        this.age=age;
        this.name=name;
        this.rollno=rollno;
    }

    List<MyComparable> li=new ArrayList<MyComparable>();


    public int compareTo(MyComparable comparable){

        if(rollno==comparable.rollno){
        return 0;}
        else
            if (rollno > comparable.rollno){
            return 1;
            }else
            {
                return -1;
            }
        }


    public static void main(String[] args) {
        MyComparable m1=new MyComparable("Mk",20,22);
        MyComparable m2=new MyComparable("Dk",10,23);
        MyComparable m3=new MyComparable("Mk",30,25);
        System.out.println();
    }

}
