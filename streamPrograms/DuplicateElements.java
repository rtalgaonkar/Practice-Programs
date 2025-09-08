package streamPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("first", "second", "third", "first", "first");
        Set<String> duplicates = strings.stream().filter(n-> Collections.frequency(strings,n) > 1).collect(Collectors.toSet());
        System.out.print(duplicates);
    }
}
