package org.example.array.easy;

import java.util.Arrays;

public class FirstLargest {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bruteForce(arr);
        optimal(arr);
    }

    private static void optimal(int[] arr) {
        int large = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large)
                large = arr[i];
        }
        System.out.println(large);
    }

    private static void bruteForce(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
}
