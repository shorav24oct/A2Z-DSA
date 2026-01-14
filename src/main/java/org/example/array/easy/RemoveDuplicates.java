package org.example.array.easy;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        System.out.println(removeDup(arr, arr.length));
        System.out.println(removeDup(arr));
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

    /*
    TC: Big-O(N log N) + N
    SC: Big-O(N)
     */
    private static int removeDup(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int i : arr) {
            set.add(i);
        }

        int index = 0;

        for (int i : set) {
            arr[index] = i;
            index++;
        }

        return index;
    }
}
