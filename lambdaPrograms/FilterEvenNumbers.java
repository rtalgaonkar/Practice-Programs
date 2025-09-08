package lambdaPrograms;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(2,3,4,5,6,7,8,9);
        List<Integer> evens = ints.stream().filter(n -> n%2==0).toList();
        System.out.println(evens);
    }
}
