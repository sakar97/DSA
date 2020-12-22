// IN: {7 4 0 9}
// OUT: 10
class trapping_water {
    public static void main(String args[]) {
        int[] arr = { 7, 4, 0, 9 };
        int n = arr.length;
        int res = rainwater(arr, n);
        System.out.println(res);
    }

    private static int rainwater(int[] height, int n) {
        int left = 0;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int res = 0;
        while (left <= right) {

            if (height[left] <= height[right]) {
                if (height[left] >= leftMax)
                    leftMax = height[left];
                else {
                    res += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax)
                    rightMax = height[right];
                else {
                    res += rightMax - height[right];
                }
                right--;
            }
        }
        return res;
    }

}
