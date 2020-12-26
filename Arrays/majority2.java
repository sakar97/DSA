import java.util.*;

public class majority2 {
    public static void main(String args[]) {
        int[] arr = { 7, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5 };
        int c1 = 0;
        int c2 = 0;
        int me1 = -1;
        int me2 = -1;
        List<Integer> ls = new ArrayList<>();
        for (int n : arr) {
            if (n == me1)
                c1++;
            else if (n == me2)
                c2++;
            else if (c1 == 0) {
                me1 = n;
                c1++;
            } else if (c2 == 0) {
                me2 = n;
                c2++;
            } else {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == me1)
                c1++;
            else if (arr[i] == me2)
                c2++;
        }
        if (c1 > arr.length / 3)
            ls.add(me1);
        if (c2 > arr.length / 3)
            ls.add(me2);
        System.out.println(ls.get(0) + " " + ls.get(1));
    }
}
