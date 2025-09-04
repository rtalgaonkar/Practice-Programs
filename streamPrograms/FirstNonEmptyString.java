package streamPrograms;

import java.util.Arrays;
import java.util.List;

public class FirstNonEmptyString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("", "", "first nonempty", "second nonempty");
        String first = strings.stream().filter(n -> !n.isEmpty()).findFirst().toString();
        System.out.println(first);
    }
}
