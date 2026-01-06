package org.example.array.easy;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int N = 5;
        System.out.println(missingNo(arr, N));
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
