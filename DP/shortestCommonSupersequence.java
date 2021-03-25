class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        return LCS(str1,str2);
    }
    private String LCS(String a, String b){
        int n = a.length();
        int m = b.length();
        int[][] t = new int[n+1][m+1];
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(a.charAt(i-1) == b.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                }else{
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
            }
        }
        StringBuffer ans = new StringBuffer();
        int i = n, j = m;
        
        while(i > 0 && j > 0){
            char c1 = a.charAt(i-1);
            char c2 = b.charAt(j-1);
            
            if(c1 == c2){
                ans.append(c2+"");
                i--;
                j--;
            }else{
                if(t[i-1][j] > t[i][j-1]){
                    ans.append(c1+"");
                    i--;
                }else{
                    ans.append(c2+"");
                    j--;
                }
            }
        }
        
        while(i > 0){
            char c1 = a.charAt(i-1);
            ans.append(c1+"");
            i--;
        }
        while(j > 0){
            char c2 = b.charAt(j-1);
            ans.append(c2+"");
            j--;
        }
        
        return ans.reverse().toString();
    }
}
