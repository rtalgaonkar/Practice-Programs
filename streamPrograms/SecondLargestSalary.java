package streamPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondLargestSalary {
    public static void main(String[] args) {
        Integer[] salaries = {60000, 80000, 75000, 80000, 50000};
        Optional<Integer> maxSalary = Arrays.stream(salaries).sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
        maxSalary.ifPresent(integer -> System.out.println("second higest salary: " + integer));
    }
}
