package Base;

 public class AccessSpecifier  implements InterfaceClass{
    String s0="Default var";
    private String s1="Pri Global var";
    public String s2="Pub Global var";
    protected  String s3="Pro Global var";

    public AccessSpecifier() {
    //constructor
    }

     AccessSpecifier(int k){
         System.out.printf("parent constructor"+k);
     }

     public void print() {
         //interface method
     }

     public void show() {
         //intrface method
     }

     private void priSpecify(){
   // pubSpecify();
    String s1="local private";
    String s2="local protected";
    System.out.println("..This is private method =="+s0);
}
 public void pubSpecify(){  //pub method can call private & pro method in it
    priSpecify();
    proSpecify();
    int d=1;
     System.out.println("..public method=="+s2);
 }
 protected void proSpecify(){
     System.out.println("..protected method=="+s3);

 }


}
