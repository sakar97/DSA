class min_inse {
    public static void main(String[] args) {
        String a = "heap";
        String b = "pea";
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }

        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (a.charAt(i - 1) == b.charAt(j - 1)) {

                }
    }
}