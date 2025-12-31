package org.example.array.easy;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 4};
        System.out.println(removeDup(arr, arr.length));;
    }

    /*
    TC: Big-O(n)
    SC: Big-O(1)
     */
    private static int removeDup(int[] arr, int n) {
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return (i + 1);
    }
}
