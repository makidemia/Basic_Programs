package SeedCollection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Employee {
    String ename;
    int eid;
    long esalary;
    Set<String> skillSet; //declare set

    public Employee(int eid,String ename,long esalary,String ...skills){
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;

        List<String> skillList =Arrays.asList(skills);
        skillSet=new HashSet<String>();
        skillSet.addAll(skillList);
     //   System.out.println(skillSet.size());
       // skillSet.addAll(Arrays.asList(skills));
        //System.out.println(skillSet.size());
    }

    public Employee(){}

    @Override
    public String toString() {
        return eid+" "+ename+" "+esalary+" "+skillSet;
    }
}
