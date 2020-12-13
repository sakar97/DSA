public class reverse_int {
    public static void main(String args[]) {
        int x = 1234;
        int reverse = 0;
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
                System.out.println("0");
        }
        System.out.println(reverse);
    }
}
