package SeedPractice;

public class SeedPractice {

    public static void main(String[] args) {

        Employee[] earray=new Employee[5];

        earray[0]=new Employee(1,"ak",1000);
        earray[1]=new Employee(2,"bk",2000);
        earray[2]=new Employee(3,"ck",3000);

        for(Employee e:earray) {
            System.out.println(earray);
        }
        Employee e1=new Employee(1,"ak",1000);
        Employee e2=new Employee(2,"bk",2000);
        Employee e3=new Employee(3,"ck",3000);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
