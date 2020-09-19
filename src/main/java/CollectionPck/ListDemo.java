package CollectionPck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    @Override
    public String toString() {
        String s="jhk";
        return s;
    }

    public static void main(String[] args) {

        List<String> arr=new ArrayList<String>();

        arr.add("simmi");
        arr.add("simran");
        arr.add("mahek");

        System.out.println(arr.contains("simmi")+" "+arr.get(0)+" "+ arr.isEmpty());

        String s= (String) arr.get(0);

        Iterator it=arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            System.out.println();
        }
        ListDemo ld=new ListDemo();
        System.out.println(ld.toString());

    }

}
