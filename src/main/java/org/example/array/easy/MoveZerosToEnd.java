package org.example.array.easy;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 0, 4, 0, 5};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        moveZeros(arr, n);
    }

    /*
    Brute Force
    TC: Big-O(2N)
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
