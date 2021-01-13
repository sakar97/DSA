class factorial_trailing_zero {
    public static void main(String args[]) {
        System.out.println(trailingZeroes(5));
    }

    public static int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}