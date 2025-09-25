package streamPrograms;

import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";
        char[] charArray1 = s1.toCharArray();
        boolean isAnagram = true;
        for(char c : charArray1) {
            if (!s2.contains(String.valueOf(c))) {
                isAnagram = false;
                break;
            }
        }

        //other way = better way
        char[] charArray11 = s1.toCharArray();
        char[] charArray22 = s1.toCharArray();

        Arrays.sort(charArray11);
        Arrays.sort(charArray22);
        boolean equalStrs = Arrays.equals(charArray11, charArray22);

        System.out.println("Anagram string" + isAnagram);
    }
}
