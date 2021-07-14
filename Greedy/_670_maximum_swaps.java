class Solution {
    public int maximumSwap(int num) {
        char[] arr=Integer.toString(num).toCharArray();
        int[] li=new int[10];
        
        for(int i=0;i<arr.length;i++){
            int digit=arr[i]-'0';
            li[digit]=i;
        }
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            int digit=arr[i]-'0';
            for(int j=9;j>digit;j--){
                if(li[j]>i){
                    swap(arr,i,li[j]);
                    flag=true;
                    return Integer.parseInt(String.valueOf(arr));
                }
            }
            if(flag == true){break;}
        }
        return num;
    }
    public static void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }    
}
