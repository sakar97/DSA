import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<Integer>();
        for (int n : nums) {
            hs.add(n);
        }
        int res = 0;
        for (int n : nums) {
            if (!hs.contains(n - 1)) {
                int currentStreak = 1;
                int currentNum = n;
                while (hs.contains(currentNum + 1)) {
                    currentStreak += 1;
                    currentNum += 1;
                }
                res = Math.max(res, currentStreak);
            }
        }
        return res;
    }
}