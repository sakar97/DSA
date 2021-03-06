public class count_one_bits {
    public static void main(String[] args) {
        int n = 0010100001111;
        int one = 0;
        while (n != 0) {
            one = one + (n & 1);
            n >>>= 1;
        }
        System.out.println(one);
    }
}
