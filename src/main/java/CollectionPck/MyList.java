package CollectionPck;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;

public class MyList {

        public static void main(String args[]){

            ArrayList<String> al=new ArrayList<String>();
            al.add("Amit");
            al.add("Vijay");
            al.add("Kumar");
            al.add(1,"Sachin");
            al.add(2,"pk");

            System.out.println("element at 2nd position: "+al.get(3));

            ListIterator<String> itr=al.listIterator();
}
    //public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable



}
