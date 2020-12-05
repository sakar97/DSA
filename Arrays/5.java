// IN: -12, 11, -13, -5, 6, -7, 5, -3, -6
// OUT: -12 -13 -5 -7 -3 -6 11 6 5

import java.util.*;

class move_negative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        neg(arr, n);
        sc.close();
    }

    private static void neg(int[] arr, int n) {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}
// TC: O(N)