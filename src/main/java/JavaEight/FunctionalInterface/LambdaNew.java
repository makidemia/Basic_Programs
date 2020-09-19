package JavaEight.FunctionalInterface;

import CollectionPck.Employee;

import java.util.Arrays;

public class LambdaNew implements Comparable{

    Arrays arr[]=new Arrays[20];

    static void sortLargeNumbers(String arr[]) {
        Arrays.sort(arr, (left, right) ->
        {
            if (left.length() != right.length())
            { return left.length() - right.length(); }
            return left.compareTo(right);
        });
    }

    @Override
    public int compareTo(Object o) {
return 0;
            }
}
