package SeedCollection;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        Employee[] employees=new Employee[5];

        List<Employee> elist=new ArrayList<Employee>();

        employees[0]=new Employee(1,"ak",1000,"java","c");
        employees[1]=new Employee(2,"bk",2000,"javascript","c");
        employees[2]=new Employee(3,"ck",3000,"java","c++");
        employees[3]=new Employee(4,"dk",4000,"java","c#");

        for(int i=0;i<employees.length-1;i++){
            elist.add(employees[i]);
        }
        System.out.println(elist);

    }

}
