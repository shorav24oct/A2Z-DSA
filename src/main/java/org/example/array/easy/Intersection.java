package org.example.array.easy;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 4};
        int[] b = {1, 2, 3, 5};

        int n1 = a.length;
        int n2 = b.length;

        intersect(a, b, n1, n2);
    }

    private static void intersect(int[] a, int[] b, int n1, int n2) {

        int[] visited = new int[n2];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (a[i] == b[j] && visited[j] == 0) {
                    list.add(a[i]);
                    visited[j] = 1;
                    break;
                }
                if (b[j] > a[i])
                    break;
            }
        }
        System.out.println(list);
    }
}
