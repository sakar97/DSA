
// IN:[6,2,5,4,5,1,6]
import java.util.*;

public class maximum_area_histogram {
    public static void main(String args[]) {
        int[] height = { 2, 4 };
        int[] left = new int[height.length];// [-1,2]
        int[] right = new int[height.length];// [2,2]
                                             // [2,-1] == [4,-4]
        Stack<int[]> s = new Stack<>();
        // left
        for (int i = 0; i < height.length; i++) {
            if (s.size() == 0) {
                left[i] = -1;
            } else if (s.size() > 0 && s.peek()[0] < height[i]) {
                left[i] = s.peek()[1];
            } else if (s.size() > 0 && s.peek()[0] >= height[i]) {
                while (s.size() > 0 && s.peek()[0] >= height[i]) {
                    s.pop();
                }
                if (s.size() == 0) {
                    left[i] = -1;
                } else {
                    left[i] = s.peek()[1];
                }
            }
            s.push(new int[] { height[i], i });
        }
        s.clear();
        // right
        for (int i = height.length - 1; i >= 0; i--) {
            if (s.size() == 0) {
                right[i] = height.length;
            } else if (s.size() > 0 && s.peek()[0] < height[i]) {
                right[i] = s.peek()[1];
            } else if (s.size() > 0 && s.peek()[0] >= height[i]) {
                while (s.size() > 0 && s.peek()[0] >= height[i]) {
                    s.pop();
                }
                if (s.size() == 0) {
                    right[i] = height.length;
                } else {
                    right[i] = s.peek()[1];
                }
            }
            s.push(new int[] { height[i], i });
        }
        System.out.println("right+=" + right[1]);
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            maxArea = Math.max(maxArea, height[i] * (right[i] - left[i] - 1));
        }
        System.out.println(maxArea);
    }
}
