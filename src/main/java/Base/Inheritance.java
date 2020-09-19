package Base;

public class Inheritance extends AccessSpecifier {//implements InterfaceClass{

    int a=10;

    private void preSpecify(){

        String s1="local private";
        String s2="local protected";
        System.out.println("This is private method "+a);

    }
    protected void childMethod(){
        System.out.println("This child's private method");
    }

   public void show() {
        System.out.println("show method implemented");


    }

    public void print() {
        System.out.println("print method in child class has implemented");
        System.out.println("protected variable"+s0);
    }

    Inheritance(){
        System.out.println("Default constructor");
    }


    Inheritance(int i){
        super();
        this.a=i;
        System.out.println("parameterized constructor"+a);
    }


}
