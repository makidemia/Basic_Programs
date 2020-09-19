package ClonePractice;

public class DeepClone implements Cloneable{

    String name;
    int salary;
    CloneDemo cloneDemo;

    DeepClone(String name,int salary,CloneDemo cloneDemo){
        this.name=name;
        this.salary=salary;
        this.cloneDemo=cloneDemo;
    }
    DeepClone(){}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CloneDemo cd=new CloneDemo(cloneDemo.i,cloneDemo.j); //create a new object
        DeepClone dc=new DeepClone("lk",900,cd); //refrence passed to that for cloning
        return dc;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
       // CloneDemo internalRefrence=new CloneDemo(80,90);
        DeepClone deepClone=new DeepClone("mk",200,new CloneDemo(20,90));
        System.out.println(deepClone.name+" "+deepClone.salary+" "+deepClone.cloneDemo.i+" "+deepClone.cloneDemo.j+" internalRefrence");

        DeepClone deepClone1=(DeepClone)deepClone.clone();

        deepClone1.name="pk";
        deepClone1.salary=400;
        deepClone1.cloneDemo.i=1000;
        deepClone1.cloneDemo.j=2000;

        System.out.println(deepClone1.name+" "+deepClone1.salary+" "+deepClone1.cloneDemo.i+" "+deepClone1.cloneDemo.j+" ");
        System.out.println("recheck 4 not changed"+deepClone.name+" "+deepClone.salary+" "+deepClone.cloneDemo.i+" "+deepClone.cloneDemo.j);


    }


}
