package lambdaPrograms;

import java.util.Arrays;
import java.util.List;

public class pringtStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Shaarvee","Rajul","Ruchit","Rajvee");
        strings.forEach(s -> {System.out.println(s);});
    }
}
