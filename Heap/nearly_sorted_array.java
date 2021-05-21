package Heap;

import java.util.*;

public class nearly_sorted_array {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 12, 56, 8 };
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = arr.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (pq.size() > k) {
                arr[index++] = pq.poll();
            }
            pq.add(arr[i]);
        }
        Iterator<Integer> i = pq.iterator();
        while (i.hasNext()) {
            arr[index++] = pq.poll();
        }
        for (int ii = 0; ii < n; ii++) {
            System.out.print(arr[ii] + " ");
        }
    }
}
