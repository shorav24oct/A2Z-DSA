package org.example.hashing;

import java.util.HashMap;
import java.util.Map;

/*
count-frequency-of-each-element-in-the-array
 */
public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3};
        //countFreqUsingArr(arr, arr.length);
        countFreqUsingMap(arr, arr.length);
    }

    private static void countFreqUsingMap(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Traverse through the HashMap and print frequencies
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    private static void countFreqUsingArr(int[] arr, int n) {
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            // Skip this element if it's already processed
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            // Output the element and its count
            System.out.println(arr[i] + " " + count);
        }
    }
}
