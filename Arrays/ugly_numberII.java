class Solution {
    public int nthUglyNumber(int n) {
        if(n == 1) return 1;
        int[] ugly=new int[n];
        ugly[0]=1;
        int index2 = 0, index3 = 0, index5 = 0;
        int factor2 = 2, factor3 = 3, factor5 = 5;
        for(int i=1;i<n;i++){
            int min=Math.min(Math.min(factor2,factor3),factor5);
            ugly[i]=min;
            if(factor2==min){
                factor2=2*ugly[++index2];
            }
            if(factor3==min){
                factor3=3*ugly[++index3];
            }
            if(factor5==min){
                factor5=5*ugly[++index5];
            }
        }
        return ugly[n-1];
    }
}

#-># 1*2=2     1*3=3      1*5=5
#-># 2*2=4     2*3=6      2*5=10
#-># 3*2=6     3*3=9      3*5=15
#-># 4*2=8     4*3=12      4*5=20 
