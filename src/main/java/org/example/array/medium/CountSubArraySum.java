package org.example.array.medium;

import java.util.HashMap;

/*
Problem Statement: Given an array of integers and an integer k, return the total number of sub-arrays whose sum equals k.
A sub-array is a contiguous non-empty sequence of elements within an array.
Input : N = 4, array[] = {3, 1, 2, 4}, k = 6
Output: 2
Explanation: The sub-arrays that sum up to 6 are [3, 1, 2] and [2, 4].
 */
public class CountSubArraySum {
    public static void main(String[] args) {
        int arr[] = {-1, 1, 1};
        int k = 1;
        //System.out.println(bruteForce(arr, arr.length, k));
        System.out.println(optimal(arr, arr.length, k));
        //System.out.println(better(arr, arr.length, k));
    }

    /*
    Optimal Using prefix sum & Hashing
    TC: Big-O(n)
    SC: Big-O(1)
     */
    private static int optimal(int[] arr, int n, int k) {
        // Map to store frequency of prefix sums
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();

        // Initialize prefix sum and count of subarrays
        int prefixSum = 0;
        int count = 0;

        // Base case: prefix sum 0 has occurred once
        prefixSumCount.put(0, 1);

        // Traverse through the array
        for (int i = 0; i < n; i++) {
            // Add current element to prefix sum
            prefixSum += arr[i];

            // Calculate the prefix sum that needs to be removed
            int remove = prefixSum - k;

            // If this prefix sum has been seen before,
            // add its count to the result
            if (prefixSumCount.containsKey(remove)) {
                count += prefixSumCount.get(remove);
            }

            // Update the frequency of the current prefix sum
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }

        // Return the total count of subarrays
        return count;
    }

    /*
    Brute Force
    TC: Big-0(n*n*n)
    SC: Big-O(1)
     */
    private static int bruteForce(int[] arr, int n, int k) {
        int count = 0;

        for (int si = 0; si < n; si++) {
            for (int ei = si; ei < n; ei++) {
                int sum = 0;
                for (int i = si; i <= ei; i++) {
                    sum += arr[i];
                }
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    /*
    Better
    TC: Big-0(n*n)
    SC: Big-O(1)
     */
    private static int better(int[] arr, int n, int k) {
        int count = 0;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
