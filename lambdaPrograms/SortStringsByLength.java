package lambdaPrograms;

import java.util.Arrays;
import java.util.List;

public class SortStringsByLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Shaarvee","Rajul","Ruchit","Rajvee");
        strings.sort((s1,s2)-> Integer.compare(s1.length(), s2.length()));
        System.out.println(strings);
    }
}
