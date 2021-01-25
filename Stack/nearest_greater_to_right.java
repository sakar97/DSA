
//Nearest Greater to Right
//O(N)== TC
//IN: [1,3,2,4]
//OUT:[3,4,4,-1]
import java.util.*;

class next_largest {
    public static void main(String args[]) {
        List<Integer> as = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        int[] arr = { 1, 3, 2, 4 };
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (s.size() == 0) {
                as.add(-1);
            } else if (s.size() > 0 && s.peek() > arr[i]) {
                as.add(s.peek());
            } else if (s.size() > 0 && s.peek() <= arr[i]) {
                while (s.size() > 0 && s.peek() <= arr[i]) {
                    s.pop();
                }
                if (s.size() == 0) {
                    as.add(-1);
                } else {
                    as.add(1);
                }
            }
            s.push(arr[i]);
        }
        Collections.reverse(as);
        System.out.println(as);
    }
}