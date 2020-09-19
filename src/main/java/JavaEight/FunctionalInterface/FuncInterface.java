package JavaEight.FunctionalInterface;

@FunctionalInterface
public interface FuncInterface {

    public void func(int x);

    default void normalFun() {
        System.out.println("default method");
    }

    static void m3(){
        System.out.println("static method");
    }
}





