import java.util.*;

public class minimum_element_stack {
    static Stack<Integer> s = new Stack<>();
    static Stack<Integer> temp = new Stack<>();

    public static void main(String args[]) {
        int[] arr = { 18, 19, 25, 15, 30 };
        push(18);
        push(19);
        push(25);
        push(15);
        push(30);
    }

    static void push(int a) {
        s.push(a);
        if (temp.size() == 0 || a <= temp.peek()) {
            temp.push(a);
        }
    }

    int pop() {
        if (s.size() == 0)
            return -1;
        int ans = s.peek();
        s.pop();
        if (temp.peek() == ans) {
            temp.pop();
        }
        return ans;
    }

    int get_minEle() {
        if (temp.size() == 0) {
            return -1;
        } else {
            return temp.peek();
        }
    }
}
