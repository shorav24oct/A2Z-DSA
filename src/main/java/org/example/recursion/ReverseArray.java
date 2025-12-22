package org.example.recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        System.out.println("Array before swap");
        System.out.println(Arrays.toString(a));

        //reverseAnArray(a, 0, a.length - 1);
        revArr(a, 0);

        System.out.println("Array after swap");
        System.out.println(Arrays.toString(a));
    }

    /*
    Using 2 pointers
     */
    private static void reverseAnArray(int[] a, int left, int right) {
        if (left >= right)
            return;

        swap(a, left, right);
        reverseAnArray(a, left + 1, right - 1);
    }

    /*
    using single variable
     */
    private static void revArr(int[] a, int i) {
        if (i >= (a.length / 2))
            return;

        swap(a, i, a.length - i - 1);
        revArr(a, i + 1);
    }

    private static void swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

}
