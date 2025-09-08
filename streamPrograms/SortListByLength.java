package streamPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class SortListByLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("first", "second", "third", "fourth", "fifth");
        List<String> sorted = strings.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.print(sorted);
    }
}
