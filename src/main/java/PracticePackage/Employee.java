package PracticePackage;

public class Employee {
    String empName;
    int empId;
    int empSalary;

    Employee(String empName,int empId,int empSalary){
        this.empName=empName;
        this.empId=empId;
        this.empSalary=empSalary;

    }

       @Override
    public String toString() {
        return "employee name= "+empName+" employee Id= "+empId+" employee Salary "+empSalary;
    }
}
