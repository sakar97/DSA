class subarray_sum {
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0;
        int res = Integer.MAX_VALUE;
        int val_sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            val_sum += nums[i];
            while (val_sum >= s) {
                res = Math.min(res, i + 1 - left);
                val_sum -= nums[left];
                left++;
            }
        }

        return (res != Integer.MAX_VALUE) ? res : 0;
    }
}