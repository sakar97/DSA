package Heap;

import java.util.*;

public class sum_between_k_smallest {

    public static void main(String[] args) {
        int[] arr = { 20, 8, 22, 4, 12, 10, 14 };
        int k1 = 3;
        int k2 = 6;
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int first = isSmallest(arr, k1, pq);
        pq.clear();
        int second = isSmallest(arr, k2, pq);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first && arr[i] < second) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }

    private static int isSmallest(int[] arr, int k, PriorityQueue<Integer> pq) {
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}
