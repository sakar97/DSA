class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] nums, int n) {
        // code here
        long maxproduct = 0;
        long currproduct = 1;
        if (nums.length == 1)
            return nums[0];
        for (int i = 0; i < nums.length; i++) {
            currproduct *= nums[i];
            maxproduct = Math.max(maxproduct, currproduct);
            if (currproduct == 0)
                currproduct = 1;
        }
        currproduct = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            currproduct *= nums[i];
            maxproduct = Math.max(maxproduct, currproduct);
            if (currproduct == 0)
                currproduct = 1;
        }
        return maxproduct;
    }
}