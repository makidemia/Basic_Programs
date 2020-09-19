package JavaEight;


import java.util.function.Predicate;

public interface LambdaCheck {

    public static <T> boolean optCheck(T t, Predicate<T> p) {
        return optCheck(t, p, false);
    }

    public static <T> boolean optCheck(T t, Predicate<T> p, boolean defaultValue) {
        return t != null ? p.test(t)  : defaultValue;
    }
}
