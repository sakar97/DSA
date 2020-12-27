class median_sameSize {
    public static void main(String args[]) {
        int[] arr1 = { 1, 2 };
        int[] arr2 = { 3, 4 };
        int start_a = 0;
        int end_a = arr1.length - 1;
        int start_b = 0;
        int end_b = arr2.length - 1;
        double k = median(arr1, arr2, start_a, end_a, start_b, end_b);
        System.out.println(k);
    }

    public static double median(int[] arr1, int[] arr2, int start_a, int end_a, int start_b, int end_b) {
        int n = end_a - start_a;
        if (n == 2) {
            double k = (Math.max(arr1[start_a], arr2[start_b]) + Math.min(arr1[end_a], arr2[end_b])) / 2;
            return 1.0 * (k);
        }
        int m1_index, m2_index = 0;
        int m1, m2 = 0;
        m1_index = (start_a + end_a) / 2;
        m2_index = (start_b + end_b) / 2;
        if (n % 2 == 0) {
            m1 = (arr1[m1_index] + arr2[m1_index + 1]) / 2;
            m2 = (arr1[m2_index] + arr2[m2_index + 1]) / 2;
        } else {
            m1 = arr1[m1_index];
            m2 = arr2[m2_index];
        }
        if (m1 == m2) {
            return m1;
        } else if (m1 < m2) {
            start_a = m1_index;
            end_b = m2_index;
        } else {
            start_b = m2_index;
            end_a = m1_index;
        }
        return median(arr1, arr2, start_a, end_a, start_b, end_b);
    }
}
