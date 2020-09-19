package Programs;

public class StringChange {

    public void method1() {
        String a = "my name is Mahek";


      /*  for (int i = 0; i < a.length(); i++) {

        }
      */  char carr[] = a.toCharArray();
        for (int c = 0; c < carr.length; c++) {
            System.out.print(carr[c]);
            String s = " ";
            int spaces = a.indexOf(s);
            //System.out.println(spaces);
        }

        int index = a.indexOf(" ");
       // System.out.println(+index);
    }

    public static void main(String[] args) {
        StringChange sc = new StringChange();
        sc.method1();
    }
}
