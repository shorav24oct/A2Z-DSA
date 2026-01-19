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
        int[] nums = {2, 0, 1, 0, 1, 2};
        System.out.println("Array Before Sort -> " + Arrays.toString(nums));
        //System.out.println("Array After Sort -> " + Arrays.toString(sortArrayOf0s1s(nums)));
        //System.out.println("Array After Sort -> " + Arrays.toString(sortArrayOf0s1s(nums, nums.length)));
        System.out.println("Array After Sort -> " + Arrays.toString(sortArrayOf0s1s2s(nums, nums.length)));
    }

    /*
    Optimal Approach using DNF algorithm
    TC: Big-O(n)
    SC: Big-O(1)
     */
    private static int[] sortArrayOf0s1s2s(int[] a, int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {

            // 1st Case
            if (a[mid] == 0) {
                swap(a, low, mid);
                low++; mid++;
            }

            // 2nd case
            else if (a[mid] == 1) {
                mid++;
            }

            // 3rd case
            else {
                swap(a, mid, high);
                high--;
            }
        }
        return a;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    /*
    Better Approach
    TC: Big-O(2n)
    SC: Big-O(1)
     */
    private static int[] sortArrayOf0s1s(int[] nums, int n) {
        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                count0++;
            else if (nums[i] == 1) {
                count1++;
            }
        }

        for (int i = 0; i < count0; i++)
            nums[i] = 0;

        for (int i = count0; i < count0 + count1; i++)
            nums[i] = 1;

        for (int i = count0 + count1; i < n; i++)
            nums[i] = 2;

        return nums;
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
