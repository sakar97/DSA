
//IN : [1,3,2,4]
//OUT: [-1,2,-1,-1]
import java.util.*;

public class nearest_smallest_to_right {
    public static void main(String args[]) {
        List<Integer> as = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        int[] arr = { 1, 3, 2, 4 };
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (s.size() == 0) {
                as.add(-1);
            } else if (s.size() > 0 && s.peek() < arr[i]) {
                as.add(s.peek());
            } else if (s.size() > 0 && s.peek() >= arr[i]) {
                while (s.size() > 0 && s.peek() >= arr[i]) {
                    s.pop();
                }
                if (s.size() == 0) {
                    as.add(-1);
                } else {
                    as.add(s.peek());
                }
            }
            s.push(arr[i]);
        }
        Collections.reverse(as);
        System.out.println(as);
    }
}
