package Heap;

import java.util.*;

public class connect_n_ropes {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 6 };
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }
        int sum = 0;
        while (pq.size() >= 2) {
            int f = pq.poll();
            int s = pq.poll();
            sum = sum + f + s;
            pq.add(f + s);
        }
        System.err.println(sum);
    }
}
