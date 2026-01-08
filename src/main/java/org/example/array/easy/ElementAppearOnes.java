package org.example.array.easy;

public class ElementAppearOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        //System.out.println(bruteForce(arr, arr.length));
        System.out.println(optimal(arr, arr.length));
    }

    /*
    TC: Big-O(n)
    SC: Big-O(1)
     */
    private static int optimal(int[] arr, int n) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }

    /*
    TC: Big-O(n * n)
    SC: Big-O(1)
     */
    private static int bruteForce(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int count = 0;
            int num = arr[i];

            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }

            if (count == 1)
                return num;
        }
        return -1;
    }
}
