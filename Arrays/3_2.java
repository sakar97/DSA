
// IN: 4 1 0 5 2 , k=2
// OUT: min= 1, max= 4
import java.util.*;

class kmax_min2 {
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
        int max = 0;
        int smallest = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] freq = new int[max + 1];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        int t = 0;
        for (int i = 1; i <= max; i++) {
            if (freq[i] > 0) {
                smallest += freq[i];
            }
            if (smallest >= k) {
                t = i;
            }
        }
        System.out.print("min=" + t);
    }
}
// TC= O(N) because of the sort
// Do counting sort which stores the freq of elements in different array
// find the kth element in second array