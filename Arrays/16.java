// IN: N = 5, arr[] = {2, 4, 1, 3, 5}
// OUT: 3
//Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
class inversion_count {
    public static void main(String args[]) {

        int[] arr = { 2, 4, 1, 3, 5 };
        int n = arr.length;
        int[] temp = new int[n];
        int l = 0;
        int r = n - 1;
        int ans = mergeSort(arr, temp, l, r);
        System.out.println("Count:" + ans);
    }

    private static int mergeSort(int[] arr, int[] temp, int l, int r) {
        int mid = 0;
        int inv_count = 0;
        if (r > l) {
            mid = (l + r) / 2;
            inv_count += mergeSort(arr, temp, l, mid);
            inv_count += mergeSort(arr, temp, mid + 1, r);
            inv_count += merge(arr, temp, l, mid + 1, r);
        }
        return inv_count;
    }

    private static int merge(int[] arr, int[] temp, int l, int m, int r) {
        int i, j, k, inv_count = 0;
        i = l;
        j = m;
        k = l;
        while (i <= m - 1 && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inv_count += (m - i);
            }
        }
        while (i <= m - 1) {
            temp[k++] = arr[i++];
        }
        while (j <= r) {
            temp[k++] = arr[j++];
        }
        for (int p = l; p <= r; p++) {
            arr[p] = temp[p];
        }
        return inv_count;
    }
}
