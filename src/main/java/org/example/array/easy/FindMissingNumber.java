package org.example.array.easy;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int N = 5;

        //System.out.println(missingNo(arr, N));
        //System.out.println(missing(arr, N));
        //System.out.println(missingOptimal1(arr, N));
        System.out.println(missingOptimal2(arr, N));
    }

    /*
    Optimal 1 using XOR approach
    TC: Big-O(N)
    SC: Big-O(1)
     */
    private static int missingOptimal2(int[] arr, int n) {
        int xor1 = 0, xor2 = 0;

        for (int i = 1; i <= n; i++) {
            xor1 = xor1 ^ +i;
        }

        for (int i = 0; i < arr.length; i++) {
            xor2 = xor2 ^ +arr[i];
        }

        return xor1 ^ xor2;
    }

    /*
    Optimal 1 using Sum approach
    TC: Big-O(N)
    SC: Big-O(1)
     */
    private static int missingOptimal1(int[] arr, int n) {
        int sum = n * (n + 1) / 2;

        int s1 = 0;
        for (int i = 0; i < arr.length; i++) {
            s1 += arr[i];
        }

        return sum - s1;
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
