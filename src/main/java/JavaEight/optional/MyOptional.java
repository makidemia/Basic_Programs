package JavaEight.optional;

import java.util.Optional;

public class MyOptional {

    public void introduceOptional() {
        String s = "testValue";
        String nullValue = null;
        Optional<String> stringOptional = Optional.of(s); // allows only null value and throws nullPointer
        Optional<String> stringOptional1 = Optional.ofNullable(s);
        // Optional.of(s);  throws null pointer exception

        System.out.println("with 'ofNullable' null value:- " + Optional.ofNullable(nullValue));
    }

    public void createEmptyOptionalInstace() { // where to use
        Optional opt = Optional.empty();
        opt.isPresent();  //to know if value present or not return true/false
    }

    public void ifPresentMethodUse(){
        Optional<Integer> rollNo= Optional.of(10);
        rollNo.ifPresent(System.out::println);

    }

    public static void main(String[] args) {
        MyOptional myOptional = new MyOptional();
        myOptional.introduceOptional();
        myOptional.createEmptyOptionalInstace();
        myOptional.ifPresentMethodUse();
    }
}
