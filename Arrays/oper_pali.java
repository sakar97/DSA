public class oper_pali {
    public static void main(String args[]) {
        int[] arr = { 23, 20, 65, 45, 20, 23 };
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int c = 0;
        while (i <= j) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else if (arr[i] > arr[j]) {
                arr[j - 1] = arr[j - 1] + arr[j];
                j--;
                c++;
            } else if (arr[i] < arr[j]) {
                arr[i + 1] = arr[i + 1] + arr[i];
                c++;
                i++;
            }
        }
        System.out.println(c);
    }
}
