package org.example.array.easy;

import java.util.Arrays;

public class LeftRotateByD {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int d = 3;

        System.out.println(Arrays.toString(arr));
        //rotateByDBruteForce(arr, n, d);
        rotateByDOptimal(arr, n, d);
    }

    /*
    TC: Big-O(2n)
    SC: Big-O(1)
     */
    private static void rotateByDOptimal(int[] arr, int n, int d) {
        // Step 1: reverse first d elements
        reverseArray(arr, 0, d - 1);

        // Step 2: reverse remaining n-d elements
        reverseArray(arr, d, n - 1);

        // Step 3: reverse entire array
        reverseArray(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    // Function to reverse part of the array between given indices
    private static void reverseArray(int[] arr, int start, int end) {
        // Swap elements until start meets end
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /*
    TC: Big-O(n+d)
    SC: Big-O(d)
     */
    private static void rotateByDBruteForce(int[] arr, int n, int d) {
        d = d % n;

        // Store first d elements
        // Big-O(d)
        int[] temp = Arrays.copyOfRange(arr, 0, d);

        // Shift remaining elements to the left
        // Big-O(n-d)
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Copy stored elements to the end
        // Big-O(d)
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }

        System.out.println(Arrays.toString(arr));
    }
}
