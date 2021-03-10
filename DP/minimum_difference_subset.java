public class Solution {
    public int solve(int[] A) {
        int s = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {
            s += A[i];
        }
        List<Integer> arr = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        arr = subset_sum(A, n, s);
        for (int i = 0; i < arr.size(); i++) {
            min = Math.min(min, (s - 2 * arr.get(i)));
        }
        return min;
    }

    public List<Integer> subset_sum(int[] A, int n, int s) {
        boolean dp[][] = new boolean[n + 1][s + 1];
        List<Integer> arr = new ArrayList<>();
        // Initialization
        for (int i = 0; i <= n; i++)
            dp[i][0] = true;
        for (int i = 1; i <= s; i++)
            dp[0][i] = false;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= s; j++) {
                dp[i][j] = dp[i - 1][j];
                // If i'th element is included
                if (A[i - 1] <= j)
                    dp[i][j] |= dp[i - 1][j - A[i - 1]];
            }
        }
        for (int i = 0; i <= s / 2; i++) {
            if (dp[n - 1][i]) {
                arr.add(i);
            }
        }
        return arr;
    }
}
