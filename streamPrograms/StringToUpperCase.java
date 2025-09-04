package streamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToUpperCase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("rajul", "rajvee", "shaarvee");
        System.out.println(strings.stream().map(String::toUpperCase).toList());
    }
}
