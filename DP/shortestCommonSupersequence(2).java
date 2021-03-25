class Solution {
    public String shortestCommonSupersequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] t=new int[n+1][m+1];
        String res="";
        res = dp(text1,text2,n,m,t);
        return res;
    }
    
    public String dp(String x, String y, int n,int m, int[][] t){
        String res="";
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0)
                {
                    t[i][j]=0;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
       
        int i=n;
        int j=m;
        while(i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                res+=(x.charAt(i-1));
                i--;
                j--;
                
            }else if(x.charAt(i-1)>y.charAt(j-1)){
                res += (y.charAt(j - 1));
                j--;
                
            }
            else{
                res+=x.charAt(i-1);
                i--;
                
            }
        }
        while (i > 0) 
        {
            res += (x.charAt(i - 1));
            i--;
            
        }
  
        while (j > 0)
        {
            res += (y.charAt(j - 1));
            j--;
            
        }
        StringBuffer sbf=new StringBuffer(res);
        sbf.reverse();
        return sbf.toString();
    }
}
