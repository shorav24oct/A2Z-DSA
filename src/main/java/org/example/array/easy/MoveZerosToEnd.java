package org.example.array.easy;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        moveZeros(arr, n);
        //moveZerosOptimal(arr, n);
    }

    /*
    Use 2 pointer approach
    TC: Big-O(N)
    SC: Big-O(1)
     */
    private static void moveZerosOptimal(int[] arr, int n) {
        // Pointer to the first zero
        int j = -1;

        // Find the first zero
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // Start from the next index of first zero
        for (int i = j + 1; i < n; i++) {
            // If current element is non-zero
            if (arr[i] != 0) {
                // Swap with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // Move j to next zero
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
    Brute Force
    TC: Big-O(N)
    SC: Big-O(N)
     */
    private static void moveZeros(int[] arr, int n) {
        // create temp array
        int[] temp = new int[n];

        // pointer for temp
        int index = 0;

        // copy non-zero elements from arr to temp
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
