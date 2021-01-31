import java.util.*;

class stock_span_problem {
    public static void main(String args[]) {
        List<Integer> as = new ArrayList<>();
        Stack<int[]> s = new Stack<>();
        int[] arr = { 100, 80, 60, 70, 60, 75, 85 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (s.size() == 0) {
                as.add(-1);
            } else if (s.size() > 0 && s.peek()[0] > arr[i]) {
                as.add(s.peek()[1]);
            } else if (s.size() > 0 && s.peek()[0] <= arr[i]) {
                while (s.size() > 0 && s.peek()[0] <= arr[i]) {
                    s.pop();
                }
                if (s.size() == 0) {
                    as.add(1);
                } else {
                    as.add(s.peek()[1]);
                }
            }
            s.push(new int[] { arr[i], i });
        }
        // Collections.reverse(as);
        for (int i = 0; i < as.size(); i++) {
            as.set(i, i - as.get(i));
        }
        System.out.println(as);
    }
}