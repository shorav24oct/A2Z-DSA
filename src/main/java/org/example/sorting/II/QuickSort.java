package org.example.sorting.II;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    // Recursive quick sort
    /*
    Time Complexity = n × log n
                    = O(n log n)
    Space Complexity = O(1)
     */
    private static void quickSort(int[] arr, int low, int high) {
        // Base case
        if (low < high) {
            // Find pivot index
            int pivotIndex = partition(arr, low, high);

            // Sort left sub-array
            quickSort(arr, low, pivotIndex - 1);

            // Sort right sub-array
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // Choose first element as pivot
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j)
                swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
