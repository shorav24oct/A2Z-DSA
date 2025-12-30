package org.example.array.easy;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5, 5};
        int n = arr.length;
        bruteForce(arr, n);
        better(arr, n);
        optimal(arr, n);
    }

    private static void optimal(int[] arr, int n) {

    }

    private static void better(int[] arr, int n) {

    }

    private static void bruteForce(int[] arr, int n) {
        Arrays.sort(arr);
        int large = arr[n-1];
        int secondLarge = -1;
        for (int i = n - 2; i >= 0; i--) {
            if ( arr[i] > secondLarge && arr[i] != large)
                secondLarge = arr[i];
        }
        System.out.println(secondLarge);
    }
}
