package org.example.array.medium;

public class LongestSubArrayPositive {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        //System.out.println(brute(arr, arr.length, k));
        System.out.println(optimal(arr, arr.length, k));
    }

    /*
    Optimal Approach using 2-pointer and sliding window technique
    TC: Big-O(n)
    SC: Big-O(1)
     */
    private static int optimal(int[] arr, int n, int k) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int sum = arr[0];

        while (right < n) {
            // expand sub-array window if sum < k
            right++;
            if ( right < n) {
                sum += arr[right];
            }

            // trim or shrink the window if sum > k
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            // Update the max length if sum = k
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
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
