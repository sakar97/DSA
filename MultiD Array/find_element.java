// IN: [[1,3,5,7],[10,11,16,20],[23,30,34,50]], target = 23
// OUT: false
public class find_element {
    public static void main(String args[]) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };
        int target = 23;
        find_ele(matrix, target);
    }

    public static void find_ele(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = (n * m) - 1;
        int k = 0;
        int mi = 0;
        while (low <= high) {
            int mid = (low + (high - low) / 2);
            if (matrix[mid / m][mid % m] == target) {
                k = 1;
                mi = mid;
            }
            if (matrix[mid / m][mid % m] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (k == 1) {
            System.out.println("true" + mi / m + " " + mi % m);
        } else {
            System.out.println("false");
        }
    }
}
