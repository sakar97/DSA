import java.util.*;

class subarray_sum {
    public static void main(String args[]) {
        int[] arr = { 4, 2, -3, 1, 6 };
        int n = arr.length;
        Set<Integer> hs = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0 || arr[i] == 0 || hs.contains(sum)) {
                System.out.println("Found");
            }
            hs.add(sum);
        }
        System.out.println("No data");
    }
}
