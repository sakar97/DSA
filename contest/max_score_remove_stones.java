import java.util.*;

public class max_score_remove_stones {
    public static void main(String args[]) {
        int a = 2;
        int b = 4;
        int c = 6;
        int[] num = { a, b, c };
        Arrays.sort(num);
        if (num[0] + num[1] < num[2]) {
            System.out.println(num[0] + num[1]);
        }
        System.out.println((a + b + c) / 2);
    }
}