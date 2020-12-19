
//IN: n1 = 6; A = {1, 5, 10, 20, 40, 80}
//n2 = 5; B = {6, 7, 20, 80, 100}
//n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
// OUT: 20 , 80
import java.util.*;

class find_comm {
    public static void main(String args[]) {

        int[] A = { 1, 5, 10, 20, 40, 80 };
        int[] B = { 6, 7, 20, 80, 100 };
        int[] C = { 3, 4, 15, 20, 30, 70, 80, 120 };

        commonElement(A, B, C, 6, 5, 8);
    }

    private static void commonElement(int[] A, int[] B, int[] C, int n1, int n2, int n3) {
        int i = 0;
        int j = 0;
        int k = 0;

        ArrayList<Integer> ar = new ArrayList();
        while (i < n1 && j < n2 && k < n3) {

            if (A[i] == B[j] && B[j] == C[k]) {
                if (!ar.contains(A[i]))
                    ar.add(A[i]);
                i++;
                j++;
                k++;
            } else if (A[i] < B[j]) {
                i++;
            } else if (B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }
        System.out.println(ar.size());
        for (int o = 0; o < ar.size(); o++) {
            System.out.print(ar.get(o) + " ");
        }
    }
}
