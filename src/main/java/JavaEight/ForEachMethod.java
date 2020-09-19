package JavaEight;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethod {

    public static void main(String[] args) {
        List<Integer> valuesOfList = Arrays.asList(1, 3, 5, 6, 7, 8, 5);

        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {

                System.out.println (i);
            }
        };

       // Consumer consumer=l -> {System.out.println(l); };
        //c.accept(9);

        //valuesOfList.forEach(c);
        // valuesOfList.forEach(i -> System.out.println(i));}

        //in the very efficient manner
        valuesOfList.forEach(l ->System.out.println(l));
    }
}
