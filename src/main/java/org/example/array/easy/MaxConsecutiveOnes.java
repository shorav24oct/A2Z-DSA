package org.example.array.easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1};
        System.out.println(maxConse(arr, arr.length));
    }

    private static int maxConse(int[] arr, int n) {
        int maxn = 0, count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                maxn = Math.max(maxn, count);
            } else {
                count = 0;
            }
        }
        return maxn;
    }
}
