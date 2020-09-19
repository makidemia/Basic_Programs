package Programs;

public class Program1 {

    String s1 = "Hi, this is Mahek";
    String s2 = "";

    public void method1() {  //to reverse a string

        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);
    }

  /*  public void method2() {
        String sarr[] = s2.split(" ", 3);
        for (int k = 0; k < sarr.length; k++) {
            System.out.println(sarr[k]);
        }
    } */

    public void method3() {
        char carr[] = s2.toCharArray();
        for (int c = 0; c < carr.length; c++) {
            System.out.print(carr[c]);


        }
    }

        public static void main(String[] args) {

            Program1 p1 = new Program1();
            p1.method1();
            // p1.method2();
            p1.method3();

        }

    }
