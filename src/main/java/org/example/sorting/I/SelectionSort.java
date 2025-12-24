package org.example.sorting.I;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13, 12, 25, 9};
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    /*
    Time Complexity: Big-O(n*n)
     */
    private static void sort(int[] arr, int n) {
        for (int i = 0; i <= n - 2; i++ ) {
            int min = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            swap(arr, i, min);
        }
    }

    private static void swap(int[] arr, int i, int min) {
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}
