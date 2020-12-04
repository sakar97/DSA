
//IN:4 5 1 0 8 3
//OUT: max = 8, min = 0
import java.util.*;

class maxmin {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("max=" + arr[n - 1]);
        System.out.println("min=" + arr[0]);
    }
}
