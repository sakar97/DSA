public class reverse_bit {
    public static void main(String[] args) {
        int n = 00000010100101;
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            if ((n & 1) == 1) {
                res++;
            }
            n >>= 1;
        }
        System.out.println(res);
    }
}
