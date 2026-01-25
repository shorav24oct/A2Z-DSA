package org.example.array.medium;

/*
Given an integer array nums, find the sub-array with the largest sum and
return the sum of the elements present in that sub-array.
Input: nums = [2, 3, 5, -2, 7, -4]
Output: 15
Explanation: The sub-array from index 0 to index 4 has the largest sum = 15,
which is the maximum sum of any contiguous sub-array.
 */
public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        //System.out.println(bruteMaxSubArrSum(nums, nums.length));
        System.out.println(betterMaxSubArrSum(nums, nums.length));
    }

    /*
    TC: Big-O(n * n * n)
    SC: Big-O(1)
     */
    private static int betterMaxSubArrSum(int[] nums, int n) {
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    /*
    TC: Big-O(n * n * n)
    SC: Big-O(1)
     */
    private static int bruteMaxSubArrSum(int[] nums, int n) {
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + nums[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
