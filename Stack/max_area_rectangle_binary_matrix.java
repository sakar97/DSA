import java.util.*;

public class max_area_rectangle_binary_matrix {

    public static void main(String args[]) {
        int[][] arr = { { 1, 0, 1, 0, 0 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 1, 0 } };
        int n = arr.length;
        int m = arr[0].length;
        int[] h = new int[m];
        for (int j = 0; j < m; j++) {
            h[j] = arr[0][j];
        }
        int maxArea = mah(h);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    h[j] = 0;
                } else {
                    h[j] = h[j] + arr[i][j];
                }
            }
            maxArea = Math.max(maxArea, mah(h));
        }
        System.out.println(maxArea);
    }

    public static int mah(int[] height) {
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
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            maxArea = Math.max(maxArea, height[i] * (right[i] - left[i] - 1));
        }
        return maxArea;
    }
}