package org.example.sorting.I;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {13, 12, 25, 9, 24};
        //selectionSort(arr, arr.length);
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    /*
    Time Complexity:
    Big-O(n*n) Worst Case
    Big-O(n) Best Case
     */
    private static void bubbleSort(int[] arr, int n) {
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, i, j);
            }
        }
    }

    /*
    Time Complexity: Big-O(n*n)
     */
    private static void selectionSort(int[] arr, int n) {
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
