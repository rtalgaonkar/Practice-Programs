package lambdaPrograms;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(ints.stream().reduce(0, (a, b)-> (a+b)).intValue());
    }
}
