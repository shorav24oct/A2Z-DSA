package org.example.array.easy;

public class ElementAppearOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println(bruteForce(arr, arr.length));
    }

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
