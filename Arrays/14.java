
// IN: [[1,3],[2,6],[8,10],[15,18]]
//OUT: [[1,6],[8,10],[15,18]]
import java.util.*;

class merge_interval {
    public static void main(String args[]) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        System.out.println(merge(intervals));

    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int start = intervals[0][0], end = intervals[0][1];
        for (int[] i : intervals) {
            if (i[0] > end) {
                result.add(new int[] { start, end });
                start = i[0];
                end = i[1];
            } else {
                end = Math.max(end, i[1]);
            }
            result.add(new int[] { start, end });
            return result.toArray(new int[result.size()]);
        }
    }
}
