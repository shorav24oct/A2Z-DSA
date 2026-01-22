package org.example.array.easy;

/*
Problem Statement: Given an integer array nums of size n, return the majority element of the array.

The majority element of an array is an element that appears more than n/2 times in the array.
Input:
 nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]
Output:
 7
Explanation:
 The number 7 appears 5 times in the 9-sized array, making it the most frequent element.
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(majorityElementBrute(nums));
    }

    /*
    TC: Big-O(n*n)
    SC: Big-O(1)
     */
    private static int majorityElementBrute(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > nums.length / 2)
                return nums[i];
        }
        return -1;
    }
}
