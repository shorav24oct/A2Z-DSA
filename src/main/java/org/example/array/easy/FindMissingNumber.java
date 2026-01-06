package org.example.array.easy;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int N = 5;

        //System.out.println(missingNo(arr, N));
        System.out.println(missing(arr, N));
    }

    /*
    Better Approach use Hashing
    TC: Big-O(2N)
    SC: Big-O(N)
     */
    private static int missing(int[] arr, int n) {
        int[] hash = new int[n + 1];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] = 1;
        }

        for (int i = 1; i < n; i++) {
            if (hash[i] == 0)
                return i;
        }
        return -1;
    }

    /*
    Brute Force
    TC: Big-O(n * n)
    SC: Big-O(1)
     */
    private static int missingNo(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                return i;
        }
        return -1;
    }
}
