package JavaEight.optional;

import java.util.*;

public class OptionalPractice {

    public void addInList() {
        List<String> myList = new ArrayList<>();
      /* myList.add("Test");
        myList.add("Example");
        myList.add("Sth");
*/
        String fisrstString = myList.stream().findFirst().orElseThrow(NoSuchElementException::new); // here I surely get "Test"
        System.out.println(fisrstString);
    }

    public void addInMap(){
        Map<Integer,String> myMap =new HashMap<>();
        /*myMap.put(1,"mk");
        myMap.put(2,"rk");
        myMap.put(3,"pk");
        */String name= myMap.entrySet().stream().findFirst().orElseThrow(()->new RuntimeException("map is empty")).getValue();
        System.out.println(name);

    }

    public static void main(String[] args) {
        OptionalPractice opti = new OptionalPractice();
       // opti.addInList();
        opti.addInMap();
    }
}