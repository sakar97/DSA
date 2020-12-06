
// IN: a1= 1 2 3 4 5, a2= 1 2 3
// OUT: union= 5, int= 3
import java.util.*;

class union_int {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[k];
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < k; i++) {
            a2[i] = sc.nextInt();
        }
        union(a1, a2, n, k);
        sc.close();
    }

    private static void union(int[] a1, int[] a2, int n, int k) {
        int freq[] = new int[100000];
        int union = 0;
        int inte = 0;
        for (int i = 0; i < n; i++) {
            freq[a1[i]]++;
        }
        for (int j = 0; j < k; j++) {
            freq[a2[j]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                // System.out.print(i + " ");
                union++;
            }
            if (freq[i] >= 2) {
                System.out.print(i + " ");
                inte++;
            }
        }
        System.out.println("Union=" + union);
        System.out.println("Intersection=" + inte);
    }
}
// TC: O(N+M)