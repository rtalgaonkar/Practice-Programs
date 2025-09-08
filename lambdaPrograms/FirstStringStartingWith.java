package lambdaPrograms;

import java.util.Arrays;
import java.util.List;

public class FirstStringStartingWith {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Shaarvee","Rajul","Ruchit","Rajvee");
        System.out.println(strings.stream().filter(n -> n.startsWith("Q")).findFirst().orElse("Not present"));
    }
}
