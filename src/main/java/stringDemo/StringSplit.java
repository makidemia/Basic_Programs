package stringDemo;

public class StringSplit {

    String myname="Mahek-omshree";
    String jsonform="Name:Mahek,Lname:Omshree";

    String array[]=jsonform.split(",");

    public void splitable() {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Split string is:"+array[i]);
        }
    }

    public void splitanyString(String s){
        String p=s;
        System.out.println("old String="+p);
        System.out.println(" ");
        String sarray[]=s.split(",");

        for(int i=0;i<sarray.length;i++) {
            System.out.println("json reformed as " + sarray[i]);

            String snewarr[] = sarray[i].split(":", 2);

            for (int k = 0; k < snewarr.length; k++) {
                System.out.println("new splited String ==" +snewarr[k]);
            }
            System.out.println("  ");
        }
    }

    public void method2(){
        String word = "bannanas";
        String guess = "n";
        int index;
        System.out.println(
                index = word.indexOf(guess)
        );

    }

}
