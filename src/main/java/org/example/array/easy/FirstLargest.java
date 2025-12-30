package org.example.array.easy;

import java.util.Arrays;

public class FirstLargest {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bruteForce(arr);
        optimal(arr);
    }

    private static void optimal(int[] arr) {

    }

    private static void bruteForce(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
}
