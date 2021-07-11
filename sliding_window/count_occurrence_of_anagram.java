package sliding_window;

public class count_occurrence_of_anagram {
    public static void main(String[] args) {
        String ptr = "for";
        int k = ptr.length();
        String S = "forxxxrofxxofrxx";
        int i = 0;
        int j = 0;
        int[] hash = new int[256];
        int count = k;
        int ans = 0;
        // creating a hash array to store the freq of char of pattern array
        for (char c : ptr.toCharArray()) {
            hash[c]++;
        }
        while (j < S.length()) {
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (count == 0) {
                    ans++;
                }
            }
        }
    }
}
