import java.util.*;

public class valid_parant {
    public static void main(String args[]) {
        Character[] arr = { '(', ')', '[', '{', '}' };
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                s.push(')');
            } else if (arr[i] == '{') {
                s.push('}');
            } else if (arr[i] == '[') {
                s.push(']');
            } else if (s.isEmpty() || s.pop() != arr[i]) {
                System.out.println("Invalid");
            }
        }
        if (s.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
