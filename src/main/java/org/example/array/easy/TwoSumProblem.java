package org.example.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Problem Statement: Given an array of integers arr[] and an integer target.
1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

Input: N = 5, arr[] = {2,6,5,8,11}, target = 14
Output : YES
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for first variant for second variant output will be : [1,3].
 */
public class TwoSumProblem {
    public static void main(String[] args) {
        int[] a = {3, 2, 4};
        int N = a.length;
        int target = 6;
        //System.out.println(isTwoNumExist(a, N, target));
        System.out.println(Arrays.toString(printIndices(a, N, target)));
        //printIndicesOptimal(a, N, target);
    }

    /*
    Optimal Approach use 2 pointer approach
    TC: Big-O(n)
    SC: Big-O(1)
     */
    private static void printIndicesOptimal(int[] a, int n, int target) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = a[left] + a[right];
            if (target == sum) {
                System.out.println("(" + left + " , " + right + ")");
                left++;
                right--;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
    }

    /*
    Better Approach: Use Hashing Concept
    TC: Big-O(n)
    SC: Big-O(n) due to hashing
     */
    private static int[] printIndices(int[] a, int n, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // (key, value) -> (element, indices)

        for (int i = 0; i < n; i++) {
            int complement = target - a[i];

            // Check if complement exists in map
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            // Store current element and its index
            map.put(a[i], i);
        }
        return new int[]{-1, -1};
    }

    /*
    Brute Force
    TC: Big-O(n * n)
    SC: Big-O(1)
     */
    private static String isTwoNumExist(int[] a, int n, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == target)
                    return "YES";
            }
        }
        return "NO";
    }
}
