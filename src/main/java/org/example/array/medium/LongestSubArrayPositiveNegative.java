package org.example.array.medium;

public class LongestSubArrayPositiveNegative {
    public static void main(String[] args) {
        int[] arr = {-1, 1, 1};
        int k = 1;
        System.out.println(brute(arr, arr.length, k));
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
