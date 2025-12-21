package org.example.recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        int N = 5;
        printNto1(N, N);
    }

    private static void printNto1(int i, int n) {
        if (i < 1)
            return;
        System.out.println(i);
        printNto1(i - 1, n);
    }
}
