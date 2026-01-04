package org.example.array.easy;

import java.util.*;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 4};

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

        // List to store union elements
        List<Integer> Union = new ArrayList<>();

        while (i < n1 && j < n2) {
            // If element in arr1 is smaller
            if (arr1[i] < arr2[j]) {
                // Add if empty or not duplicate
                // skipping duplicates by checking only the last inserted element.
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                    i++;
                }
            }

            // If element in arr2 is smaller
            else if (arr2[j] < arr1[i]) {
                // Add if empty or not duplicate
                // skipping duplicates by checking only the last inserted element.
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                    j++;
                }
            } else {
                // Elements are equal, add once if not duplicate
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++; j++;  // Move both pointers
            }
        }

        while (i < n1) {
            Union.add(arr1[i]);
            i++;
        }

        while (j < n2) {
            Union.add(arr2[j]);
            j++;
        }

        System.out.println(Arrays.toString(Union.toArray()));
    }
}
