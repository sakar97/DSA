package sliding_window;

public class maximum_of_all_subarray {
    public static void main(String[] args) {
        int[] arr = {};
        int n = arr.length;
        int i = 0;
        int j = 0;
        int k = 3;
        while (j < n) {
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {

            }
        }
    }
}
