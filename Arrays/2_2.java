
//IN: 4 5 1 0 8 3
//OUT: max = 8, min = 0
import java.util.*;

class max_min {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        min_max(arr, n);
        sc.close();
    }

    private static void min_max(int[] arr, int s) {
        int min = 0;
        int max = 0;
        int i = 0;
        if (s % 2 == 0) {
            if (arr[0] > arr[1]) {
                max = arr[0];
            } else {
                min = arr[0];
            }
            i = 2;
        } else {
            min = max = arr[0];
            i = 1;
        }
        while (i < s - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i + 1] < min) {
                    min = arr[i + 1];
                }
            } else {
                if (arr[i + 1] > max) {
                    max = arr[i + 1];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            i = i + 2;
        }
        System.out.println("min=" + min);
        System.out.println("max=" + max);
    }
}
// if n is even then assign first and second element as min, max
// if n is odd then assign first element as min, max