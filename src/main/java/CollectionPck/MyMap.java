package CollectionPck;

import java.util.*;

public class MyMap {
    public static void main(String[] args) {



        Map<String, Integer> mp = new HashMap<String, Integer>();
        mp.put("rk",0);
        mp.entrySet();


        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "vijay");
        map.put(4, "umesh");
        map.put(2, "ankit");

        Map<Integer, Employee> mymap=new HashMap<>();
        mymap.put(3,new Employee("mk",1000));
        mymap.put(30,new Employee("rk",2000));
        mymap.put(300,new Employee("pk",3000));

        System.out.println(mymap.values().contains("mk"));
//Now use Map.Entry for Set and Iterator
       /* Set<Map.Entry<Integer, String>> set = map.entrySet();

        Iterator<Map.Entry<Integer, String>> itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry e = itr.next();
            System.out.println(e.getValue());//no need to typecast
            System.out.println(e.getKey() + " " + e.getValue() + map.containsValue("umesh"));
        }*/


    }
}

