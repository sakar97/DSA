package Greedy;

import java.util.*;

public class minimum_platforms {
    public static void main(String[] args) {
        int[] start = { 900, 940, 950, 1100, 1500, 1800 };
        int[] end = { 910, 1200, 1120, 1130, 1900, 2000 };
        int N = 6;
        Arrays.sort(start);
        Arrays.sort(end);

        int max = 1;
        int platform = 1;
        int j = 0;
        int i = 1;
        while (i < N && j < N) {
            if (start[i] > end[j]) {
                platform--;
                j++;
            } else if (start[i] <= end[j]) {
                platform++;
                i++;
            }
            if (platform > max) {
                max = platform;
            }
        }
        System.out.println(max);
    }
}
