package streamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumbers {
    public static void main(String[] args) {
        List<Integer> allNumbers = Arrays.asList(2,5,9,8,7,6);
        List<Integer> evens = allNumbers.stream().filter(n -> n%2 == 0).toList();
        System.out.println("evens: " + evens);
    }
}
