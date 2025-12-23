package org.example.hashing;

/*
count-frequency-of-each-element-in-the-array
 */
public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3};
        countFreqUsingArr(arr, arr.length);
        countFreqUsingMap(arr, arr.length);
    }

    private static void countFreqUsingMap(int[] arr, int n) {

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
