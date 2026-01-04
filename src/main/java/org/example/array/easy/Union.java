package org.example.array.easy;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {2, 2, 3, 4, 6};

        unionOfTwoArrays(arr1, arr2, arr1.length, arr2.length);
    }

    /*
    Using 2 pointer approach
    TC: Big-O(n1 + n2)
    SC: Big-O(n1 + n2)
     */
    private static void unionOfTwoArrays(int[] arr1, int[] arr2, int n1, int n2) {
        int i = 0;
        int j = 0;
        Set<Integer> unionSet = new LinkedHashSet<>();

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                unionSet.add(arr1[i]);
                i++;
            }

            else if (arr2[j] < arr1[i]) {
                unionSet.add(arr2[j]);
                j++;
            }

            while (i < n1) {
                unionSet.add(arr1[i]);
                i++;
            }

            while (j < n2) {
                unionSet.add(arr2[j]);
                j++;
            }
        }
        System.out.println(Arrays.toString(unionSet.toArray()));
    }
}
