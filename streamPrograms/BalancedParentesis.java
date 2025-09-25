package streamPrograms;

import java.util.LinkedList;
import java.util.Stack;

public class BalancedParentesis {
    public static void main(String[] args) {
        String input = "{[()}]";
        Stack<Character> seq = new Stack<>();
        for (char c: input.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                seq.push(c);
            }
            if (c == '}') {
                char latest = seq.pop();
                if(!(latest == '{'))
                    break;
            }
            if (c == ')') {
                char latest = seq.pop();
                if(!(latest == '('))
                    break;
            }
            if (c == ']') {
                char latest = seq.pop();
                if(!(latest == '['))
                    break;
            }
        }
        if (seq.isEmpty()) {
            System.out.println("is balanced");
        } else {
            System.out.println("not balanced");
        }
    }
}
