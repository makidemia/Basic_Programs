package Base;

public class MainClass {

    public static void main(String[] args) {
       // AccessSpecifier as=new AccessSpecifier();
        //as.priSpecify();  private can't be called
        Inheritance in=new Inheritance(3);
        in.pubSpecify();  //same class
        in.childMethod();//c->c
        in.pubSpecify(); //P->c
    }
}
