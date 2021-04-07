class Solution {
    public int longestPalindromeSubseq(String s) {
        String orig=s;
        StringBuilder sb=new StringBuilder(s);
        String rev=sb.reverse().toString();
        int m=s.length();
        int n=m;
        return lcs(orig,rev,n,m);
    }
    public int lcs(String orig, String rev, int m, int n){
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(orig.charAt(i-1) == rev.charAt(j-1)){
                    dp[i][j]= 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
