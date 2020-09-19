package ClonePractice;

public class CloningClass implements Cloneable {

    String name = "mk";
    int rollno = 01;
    CloneDemo c;

    CloningClass(String name, int rollno, CloneDemo c) {
        this.name = name;
        this.rollno = rollno;
        this.c = c;
    }

    //imp
    @Override
    public Object clone() throws CloneNotSupportedException {
        CloneDemo cloneDemo = new CloneDemo(c.i, c.j); //make an object of internal refrence cloning class it can be defalt too
        CloningClass cc = new CloningClass("mk", 9, cloneDemo);//give its refrence
        System.out.println(c.toString());
        return cc;
    }

    public static void main(String[] args) {
        CloningClass cc1 = new CloningClass("rk", 9, new CloneDemo(55, 66));
        //original
        System.out.println("original values " + cc1.name + " " + cc1.rollno + " " + cc1.c.toString());
        try {
            CloningClass cc2 = (CloningClass) cc1.clone();
            //values changed
            cc2.name = "pk";
            cc2.rollno = 10;
            cc2.c.i = 21;
            cc2.c.j = 22;
            System.out.println("Deep cloning values changed of cloned object " + cc2.name + "  " + cc2.rollno + " " + cc2.c.toString());
            System.out.println("Contents of c not been overridden remains orignal " + cc1.name + " " + cc1.rollno + " " + cc1.c.toString());

            //for deep cloning u need to override clone method
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
