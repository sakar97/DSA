
// IN: 1 2 3 4 5
// OUT: 5 1 2 3 4
import java.util.*;

class cyc_rot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = arr[arr.length - 1], i;
        for (i = arr.length - 1; i > 0; i--)
            arr[i] = arr[i - 1];
        arr[0] = x;
        for (int l = 0; l < n; l++) {
            System.out.print(arr[l]);
        }
        sc.close();
    }
}
