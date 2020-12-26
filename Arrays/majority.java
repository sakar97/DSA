public class majority {
    public static void main(String args[]) {
        int[] arr = { 7, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5 };
        int count = 0;
        int me = 0;
        for (int nums : arr) {
            if (count == 0) {
                me = nums;
            }
            if (me == nums) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(me);
    }
}
