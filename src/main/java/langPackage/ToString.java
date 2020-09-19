package langPackage;

public class ToString {

    int rollNo;
    String sname;

    public ToString(int rollNo,String sname)
    {
        this.rollNo=rollNo;
        this.sname=sname;
    }

    public String toString(){
        return " "+rollNo;
    }
    public static void main(String[] args) {
    ToString toString=new ToString(12,"mk");
    ToString toString1=new ToString(11,"rk");

        System.out.println(toString.toString());
        System.out.println(toString1.toString());
    }

}
