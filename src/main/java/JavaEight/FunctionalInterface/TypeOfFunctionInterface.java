package JavaEight.FunctionalInterface;

import java.util.function.Predicate;

public class TypeOfFunctionInterface {
    public static void main(String[] args) {
        Predicate predicate= new Predicate() {
            public boolean test(Object o) {
                System.out.println("predicate method");
                return true;
            }
        };

    }

}
