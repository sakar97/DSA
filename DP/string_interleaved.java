package DP;

public class string_interleaved {
    public static void main(String[] args) {
        String A = "ab";
        String B = "bc";
        String C = "babc";
        int a = A.length();// 2
        int b = B.length();// 2
        int c = C.length();// 4
        boolean[][] dp = new boolean[a + 1][b + 1];
        boolean res = get_interleaved(A, B, C, a, b, c, dp);
        System.out.println(res);
    }

    private static boolean get_interleaved(String A, String B, String C, int a, int b, int c, boolean[][] dp) {
        if ((a + b) != c)
            return false;
        if (a == 0 & b == 0 & c == 0)
            return true;
        if (a - 1 >= 0 && A.charAt(a - 1) == C.charAt(c - 1))
            dp[a][b] = get_interleaved(A, B, C, a - 1, b, c - 1, dp);
        if (b - 1 >= 0 && B.charAt(b - 1) == C.charAt(c - 1))
            dp[a][b] = get_interleaved(A, B, C, a, b - 1, c - 1, dp);

        return dp[a][b];
    }
}
