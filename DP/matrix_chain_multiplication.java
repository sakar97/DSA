public class matrix_chain_multiplication {
    public static void main(String[] args) {
        int[] n = { 40, 20, 30, 10, 30 };
        int i = 1;
        int j = n.length - 1;
        System.out.print(solve(n, i, j));
    }

    public static int solve(int[] arr, int i, int j) {
        if (i >= j)
            return 0;
        int min = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int tempValue = solve(arr, i, k) + solve(arr, k + 1, j) + (arr[i - 1] * arr[k] * arr[j]);
            if (tempValue < min) {
                min = tempValue;
            }
        }
        return min;
    }
}