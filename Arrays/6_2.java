
// IN: a1= 1 2 3 4 5, a2= 1 2 3
// OUT: union= 5, int= 3
import java.util.*;

class uni_int {
    static void printUnion(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);
        for (int i = 0; i < arr2.length; i++)
            hs.add(arr2[i]);
        System.out.println(hs);
    }

    static void printIntersection(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);

        for (int i = 0; i < arr2.length; i++)
            if (hs.contains(arr2[i]))
                System.out.print(arr2[i] + " ");
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 1, 5, 2, 3, 6 };
        int arr2[] = { 3, 8, 6, 20, 7 };
        System.out.println("Union of two arrays is : ");
        printUnion(arr1, arr2);
        System.out.println("Intersection of two arrays is : ");
        printIntersection(arr1, arr2);
    }
}
// TC: O(N+M)