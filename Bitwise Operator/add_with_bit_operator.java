public class add_with_bit_operator {
    public static void main(String[] args) {
        int a = 123;
        int b = 39;
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        System.out.println(a);
    }
}
