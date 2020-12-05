// IN: 2 1 2 0 1 0 1
// OUT: 0 0 1 1 1 2 2

import java.util.*;

class sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr_sort(arr, n);
        sc.close();
    }

    private static void arr_sort(int[] arr, int n) {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                c0++;
            }
            if (arr[i] == 1) {
                c1++;
            }
            if (arr[i] == 2) {
                c2++;
            }
        }
        int ii = 0;
        while (c0 > 0) {
            arr[ii++] = 0;
            c0--;
        }
        while (c1 > 0) {
            arr[ii++] = 1;
            c1--;
        }
        while (c2 > 0) {
            arr[ii++] = 2;
            c2--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}
// TC: O(N)