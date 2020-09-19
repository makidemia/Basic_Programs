package CollectionPck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
String ename;
int esalary;

public Employee(String ename,int esalary){
    this.ename=ename;
    this.esalary=(Integer)esalary;
}

    @Override
    public String toString() {
        return ename+ " " +esalary;
    }

    public static void main(String[] args) {
        List<Employee> empList=new ArrayList<Employee>();
        empList.add(new Employee("mk",1000));
        empList.add(new Employee("rk",2000));
        empList.add(new Employee("pk",5000));
        System.out.println(empList);

        ComparatorDemo c=new ComparatorDemo();
        Collections.sort(empList,c);
        System.out.println(empList);
}
}
