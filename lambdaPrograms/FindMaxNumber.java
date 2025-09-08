package lambdaPrograms;

import java.util.Arrays;
import java.util.List;

public class FindMaxNumber {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(4,6,9,2,5);
        System.out.println(ints.stream().reduce(0, Integer::max).intValue());
        System.out.println(ints.stream().max((a,b) -> a.compareTo(b)).orElse(0));

    }
}
