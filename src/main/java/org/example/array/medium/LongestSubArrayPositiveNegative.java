package org.example.array.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayPositiveNegative {
    public static void main(String[] args) {
        int[] arr = {-1, 1, 1};
        int k = 1;
        //System.out.println(brute(arr, arr.length, k));
        System.out.println(optimal(arr, arr.length, k));
    }

    /*
    Optimal Approach use Hashing concept
    TC: Big-O(n)
    SC: Big-O(n)
     */
    private static int optimal(int[] arr, int n, int k) {
        int maxLength = 0; // Longest sub-array length
        int sum = 0; // Running sum

        Map<Integer, Integer> prefixSumMap = new HashMap<>(); // (key, value) -> (prefix sum, index)

        for (int i = 0; i < n; i++) {
            sum += arr[i]; // Update running prefix sum

            // Case 1: If full sub-array from 0 to i has sum = k
            if (sum == k)
                maxLength = i + 1;

            // Case 2: If (sum - k) was seen before
            int rem = sum - k;
            if (prefixSumMap.containsKey(rem)) {
                int len = i - prefixSumMap.get(rem); // Length of current valid sub-array
                maxLength = Math.max(maxLength, len);
            }

            // Store the first occurrence of a prefix sum
            if (!prefixSumMap.containsKey(sum)) {
                prefixSumMap.put(sum, i);
            }
        }
        return maxLength;
    }

    /*
    TC: Big-O(n*n*n)
    SC: Big-O(1)
     */
    private static int brute(int[] arr, int n, int k) {
        int maxLength = 0;

        // starting Index
        for (int startIndex = 0; startIndex < n; startIndex++) {

            // ending Index
            for (int endIndex = startIndex; endIndex < n; endIndex++) {

                 /* add all the elements of
                   sub-array = arr[startIndex...endIndex] */
                int sum = 0;

                for (int i = startIndex; i <= endIndex; i++) {
                    sum += arr[i];
                }

                if (sum == k) {
                    maxLength = Math.max(maxLength, endIndex - startIndex + 1);
                }
            }
        }
        return maxLength;
    }
}
