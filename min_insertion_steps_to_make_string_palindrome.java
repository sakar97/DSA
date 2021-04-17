class Solution {
    public int minInsertions(String s) {
        String temp=s;
        StringBuffer sb=new StringBuffer(s);
        temp=sb.reverse().toString();
        return (s.length()-LCS(s,temp,s.length(),s.length()));
    }
    public int LCS(String s, String rev, int m, int n){
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i == 0 || j==0){
                  dp[i][j]=0;  
                }
            }
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s.charAt(i-1) == rev.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
