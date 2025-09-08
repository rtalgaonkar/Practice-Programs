package lambdaPrograms;

import java.util.Arrays;
import java.util.List;

public class ConvertListToUppercase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Shaarvee","Rajul","Ruchit","Rajvee");
        List<String> stringsUpper = strings.stream().map(String::toUpperCase).toList();
        System.out.println(stringsUpper);
    }
}
