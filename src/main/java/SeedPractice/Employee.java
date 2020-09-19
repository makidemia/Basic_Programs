package SeedPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Employee {


    int eid;
    String ename;
    long esalary;

    public String toString() {
        return eid + " " + ename + " " + esalary + " ";
    }

    public Employee(int eid, String ename, long esalary) {
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
    }

    public Employee() {//constructor
    }
}

