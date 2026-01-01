package org.example.array.easy;

import java.util.Arrays;

public class LeftRotateByD {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int d = 4;

        System.out.println(Arrays.toString(arr));
        rotateByDBruteForce(arr, n, d);
    }

    /*
    TC: Big-O(n+d)
    SC: Big-O(d)
     */
    private static void rotateByDBruteForce(int[] arr, int n, int d) {
        d = d % n;

        // Store first d elements
        int[] temp = Arrays.copyOfRange(arr, 0, d);

        // Shift remaining elements to the left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Copy stored elements to the end
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }

        System.out.println(Arrays.toString(arr));
    }
}
