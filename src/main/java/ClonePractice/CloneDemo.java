package ClonePractice;

public class CloneDemo implements Cloneable {

    int i;
    int j;

    CloneDemo(int i,int j){
        this.i=i;
        this.j=j;
    }

    CloneDemo(){}

    @Override
    public String toString() {
        return i +" "+j;
    }


    public static void main(String[] args) {
        CloneDemo c1=new CloneDemo(10,20);
        System.out.println(c1.i+" "+c1.j);

        try {
           CloneDemo c2 = (CloneDemo)c1.clone(); //shallow cloning
            c2.i=88;
            c2.j=99;
            System.out.println("shallow cloning"+c2.i+" "+c2.j);
        }
       catch (Exception e){
           e.printStackTrace();
       }
    }
}
