package org.example.array.medium;

import java.util.Arrays;

/*
Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order.
The sorting must be done in-place, without making a copy of the original array.

Input: nums = [1, 0, 2, 1, 0]
Output: [0, 0, 1, 1, 2]
Explanation: The nums array in sorted order has 2 zeroes, 2 ones and 1 two
 */
public class SortArrayOf0s1s2s {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 1, 0};
        System.out.println("Array Before Sort -> " + Arrays.toString(nums));
        System.out.println("Array After Sort -> " + Arrays.toString(sortArrayOf0s1s(nums)));
    }

    /*
    Brute Force
    TC: Big-O(n log n)
    SC: Big-O(n)
     */
    private static int[] sortArrayOf0s1s(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}
