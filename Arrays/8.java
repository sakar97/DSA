
//IN: 
//OUT:
import java.util.*;

class maxsubsum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int meh = 0;
        int msf = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            meh = meh + arr[i];
            if (meh < arr[i]) {
                meh = arr[i];
            }
            if (msf < meh) {
                msf = meh;
            }
        }
        System.out.print(msf);
        sc.close();
    }
}
// TC: O(N)
// Simple approach is to use 2 loops and brute force the sum. It takes O(N*N)
// Best approach is to use Dynamic Programming here using recursion.