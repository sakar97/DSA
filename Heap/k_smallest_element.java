package Heap;

import java.util.*;

public class k_smallest_element {
    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        int n = arr.length;
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        System.out.print(pq.peek());
    }
}
