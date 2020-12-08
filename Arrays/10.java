
// IN: (1) 3 5 8 (9) 2 6 7 6 8 (9)
// OUT: 3
import java.util.*;

class min_jump {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = temp + arr[i];
            i = i + arr[i];
            if (i > n) {
                break;
            }
        }
        sc.close();
    }
}
