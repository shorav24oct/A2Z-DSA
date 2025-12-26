package org.example.sorting.II;

import java.util.ArrayList;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        mergeSort(arr, 0, arr.length - 1);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    // Recursive merge sort
    private static void mergeSort(int[] arr, int low, int high) {
        // base case
        if (low >= high)
            return;

        // Find mid index
        int mid = (low + high) / 2;

        // Sort left half
        mergeSort(arr, low, mid);

        // Sort right half
        mergeSort(arr, mid + 1, high);

        // Merge both halves
        merge(arr, low, mid, high);
    }

    // Function to merge two halves
    private static void merge(int[] arr, int low, int mid, int high) {
        // Create temp array
        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        // Merge both sorted parts
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // Add remaining left elements
        while (left <= mid)
            temp.add(arr[left++]);

        // Add remaining right elements
        while (right <= high)
            temp.add(arr[right++]);

        // Copy back to original array
        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
    }
}
