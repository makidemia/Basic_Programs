package PracticePackage;

public class Print {

    Object value;

    public void setAsObject(Object value){
        this.value=value;
        System.out.println(value);
    }


    public static void main(String[] args) {
        Employee emp=new Employee("mk",01,1000);
        System.out.println(emp);
        Print p=new Print();
        p.setAsObject(emp);


    }

}
