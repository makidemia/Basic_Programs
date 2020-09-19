package Loops;

public class ForLoop {

    public void method1() {
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void method2() {
        for (; ; ) {System.out.println("infinite for loop");}
    }
    public void method3(){
        while (true){
            System.out.println("infinite while");
        }
    }
    public void method4(int p){
        do {
            System.out.println("do while loop");
        }while(p<0);
    }

    public static void main(String[] args) {
        ForLoop fl = new ForLoop();
        fl.method4(0);
       // fl.method2();
       // fl.method3();
    }
}
