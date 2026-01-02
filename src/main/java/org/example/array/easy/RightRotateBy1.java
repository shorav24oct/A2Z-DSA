package org.example.array.easy;

import java.util.Arrays;

public class RightRotateBy1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        rotateBy1(arr, n);
    }

    /*
    TC: Big-O(N)
    SC: Big-O(1)
     */
    private static void rotateBy1(int[] arr, int n) {
        int temp = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
