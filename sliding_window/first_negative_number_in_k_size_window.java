package sliding_window;

import java.util.*;

public class first_negative_number_in_k_size_window {

    public static void main(String[] args) {
        int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int n = arr.length;
        int k = 3;
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (j < n) {
            if (arr[j] < 0) {
                al.add(arr[j]);
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (al.size() == 0) {
                    res.add(0);
                } else {
                    res.add(al.get(0));
                    if (arr[i] == al.get(0)) {
                        al.remove(0);
                    }
                }
                i++;
                j++;
            }
        }
        for (int l = 0; l < res.size(); l++) {
            System.out.print(res.get(l) + " ");
        }
    }
}
