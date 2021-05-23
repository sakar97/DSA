package Heap;

public class minheap_heapsort {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 3, 2, 9 };
        int n = arr.length;
        // build heap with heapify
        for (int i = n / 2 - 1; i >= 0; i--) {
            minheapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            minheapify(arr, i, 0);
        }
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void minheapify(int[] arr, int n, int i) {
        int minimum = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] < arr[minimum]) {
            minimum = left;
        }
        if (right < n && arr[right] < arr[minimum]) {
            minimum = right;
        }
        if (minimum != i) {
            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
            minheapify(arr, n, minimum);
        }
    }
}
