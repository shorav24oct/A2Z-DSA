package org.example.array.medium;

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
        int[] a = {2, 6, 5, 8, 11};
        int N = a.length;
        int target = 15;
        System.out.println(isTwoNumExist(a, N, target));
    }

    /*
    Brute Force
    TC: Big-O(n * n)
    SC: Big-O(1)
     */
    private static String isTwoNumExist(int[] a, int n, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                if (a[i] + a[j] == target)
                    return "YES";
            }
        }
        return "NO";
    }
}
