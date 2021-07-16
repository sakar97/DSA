class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;

        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return res;        
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int target_2= target-nums[j]-nums[i];
                int left=j+1;
                int right=n-1;
                
                while(left<right){
                    if(nums[left]+nums[right]>target_2) right--;
                    else if(nums[left]+nums[right]<target_2) left++;
                    else{
                        List<Integer> sun_ans=new ArrayList<>();
                        sun_ans.add(nums[i]);
                        sun_ans.add(nums[j]);
                        sun_ans.add(nums[left]);
                        sun_ans.add(nums[right]);
                        res.add(sun_ans);
                        while(left<right && nums[left] == sun_ans.get(2)) left++;
                        while(left<right && nums[right] == sun_ans.get(3)) right--;
                        
                    }
                    
                }
                while(j+1<n && nums[j+1]==nums[j]) ++j;
            }
                            while(i+1<n && nums[i+1]==nums[i]) ++i;
        }
        return res;
    }
}
