
// IN: 1,2,3,4,3
// OUT:3
import java.util.*;

class duplicate_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(dup(arr, n));
        sc.close();
    }

    private static int dup(int[] arr, int n) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hs.containsKey(arr[i])) {
                hs.put(i, hs.get(arr[i]) + 1);
            }
            hs.put(arr[i], i);
        }
        for (Map.Entry<Integer, Integer> e : hs.entrySet()) {
            if (e.getValue() > 1) {
                return e.getKey();
            }
        }
        return 0;
    }

}
