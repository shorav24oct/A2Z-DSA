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
        int arr[] = {3, 1, 2, 4, 2};
        int k = 6;
        System.out.println(bruteForce(arr, arr.length, k));
        //System.out.println(optimal(arr, arr.length, k));
    }

    /*
    Optimal Using 2 pointer and sliding window technique
    TC: Big-O(n)
    SC: Big-O(1)
     */
    private static int optimal(int[] arr, int n, int k) {
        int left = 0, right = 0;
        int maxL = 0;
        int sum = arr[0];
        int count = 0;

        while (right < n) {
            // expand window if sum < k
            right++;
            if (right < n) {
                sum += arr[right];
            }

            // shrink window if sum > k
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            // update max length if sum = k
            if (sum == k) {
                maxL = Math.max(maxL, right - left + 1);
                count++;
            }
        }
        return count;
    }

    private static int bruteForce(int[] arr, int n, int k) {
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
