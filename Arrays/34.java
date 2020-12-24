class GfG
{
	public static int palinArray(int[] a, int n)
           {    
                  boolean res =false;
                  int kk=0;
                  //add code here.
                  for(int i=0;i<n;i++){
                      res=palindrome(a[i]);
                      if(res==false){
                      kk++;
                  }
                  }
                  if(kk>0){
                      return 0;
                  }
                  else{
                      return 1;
                  }
           }
    public static boolean palindrome(int l){
        int palindromeX=0;
        int x=l;
        while(l>0){
            palindromeX=palindromeX*10+(l%10);
            l=l/10;
        }
        if(palindromeX == x){ return true;}
        else return false;
    }
           
}