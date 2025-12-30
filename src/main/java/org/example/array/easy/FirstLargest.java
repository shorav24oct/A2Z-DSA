package org.example.array.easy;

import java.util.Arrays;

public class FirstLargest {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;
        bruteForce(arr, n);
        optimal(arr, n);
    }

    /*
    TC: Big-O(n)
     */
    static int optimal(int[] arr, int n) {
        int large = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > large)
                large = arr[i];
        }
        //System.out.println(large);
        return large;
    }

    /*
    TC: Big-O(n log n)
     */
    private static void bruteForce(int[] arr, int n) {
        Arrays.sort(arr);
        System.out.println(arr[n - 1]);
    }
}
