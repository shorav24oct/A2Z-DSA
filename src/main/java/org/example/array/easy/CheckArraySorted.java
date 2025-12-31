package org.example.array.easy;

public class CheckArraySorted {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 1};
        System.out.println(isSorted(arr, arr.length));;
    }

    private static boolean isSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i])
                return false;
        }
        return true;
    }
}
