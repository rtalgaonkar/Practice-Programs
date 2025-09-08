package streamPrograms;

import java.util.Arrays;
import java.util.List;

public class FindMaxNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,50,8,9,7,84,5);
        Integer max = numbers.stream().max(Integer::compare).get();
        System.out.println(max);
    }
}
