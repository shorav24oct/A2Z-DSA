package org.example.array.medium;

/*
Problem Statement: Given an array of integers and an integer k, return the total number of sub-arrays whose sum equals k.
A sub-array is a contiguous non-empty sequence of elements within an array.
Input : N = 4, array[] = {3, 1, 2, 4}, k = 6
Output: 2
Explanation: The sub-arrays that sum up to 6 are [3, 1, 2] and [2, 4].
 */
public class CountSubArraySum {
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4};
        int k = 6;
        System.out.println(bruteForce(arr, arr.length, k));
    }

    private static int bruteForce(int[] arr, int n, int k) {
        int maxLength = 0;
        int count = 0;

        for (int si = 0; si < n; si++) {
            for (int ei = si; ei < n; ei++) {
                int sum = 0;
                for (int i = si; i <= ei; i++) {
                    sum += arr[i];
                }
                if (sum == k) {
                    count++;
                    maxLength = Math.max(maxLength, ei - si + 1);
                }
            }
        }
        return count;
    }
}
