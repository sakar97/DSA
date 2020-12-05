
// IN:123456
//OUT:654321
import java.util.*;

class reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rev(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        sc.close();
    }

    private static void rev(int a[], int start, int end) {
        int temp = 0;
        if (start >= end) {
            return;
        }
        temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        rev(a, start + 1, end - 1);
    }
}

// 1- Iterative
// 2- Recursive