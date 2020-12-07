
// IN: arr= 1 5 8 10, k=2, n=4
// OUT: 5 ==> 8-3=5;
import java.util.*;

class minheight {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        int small = arr[0] + k;
        int big = arr[n - 1] - k;
        int temp = 0;
        if (small > big) {
            temp = small;
            small = big;
            big = temp;
        }
        for (int i = 1; i < n - 1; i++) {
            int subtract = arr[i] - k;
            int add = arr[i] + k;
            if (subtract >= small || add <= big)
                continue;
            if (big - subtract <= add - small)
                small = subtract;
            else
                big = add;
        }
        System.out.print(Math.min(ans, big - small));
        sc.close();
    }
}
// TC: O(NlogN)