import java.util.*;

public class threesum {
    public static void main(String args[]) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        Arrays.sort(arr);
        Set<List<Integer>> res = new HashSet<>();
        if (arr.length == 0)
            System.out.println(new ArrayList<>(res));
        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    res.add(Arrays.asList(arr[i], arr[j++], arr[k--]));
                    while (j < k && arr[j] == arr[j + 1])
                        j++;
                    while (j < k && arr[k] == arr[k - 1])
                        k--;
                } else if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                }
            }
        }
        System.out.println(new ArrayList<>(res));
    }
}
