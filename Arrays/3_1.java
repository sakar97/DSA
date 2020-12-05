
// IN: 4 1 0 5 2 , k=2
// OUT: min= 1, max= 4
import java.util.*;

class kmax_min {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if (k < n) {
            kmin_max(arr, n, k);
        }
        sc.close();
    }

    private static void kmin_max(int[] arr, int n, int k) {
        Arrays.sort(arr);
        System.out.println("max=" + arr[n - k]);
        System.out.println("min=" + arr[k - 1]);
    }
}
// TC= O(nlogn) because of the sort