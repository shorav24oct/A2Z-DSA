package org.example.recursion;

public class Print1toN {
    public static void main(String[] args) {
        int N = 5;
        print1toN(1, N);
    }

    private static void print1toN(int i, int n) {
        if ( i > n )
            return;
        System.out.println(i);
        print1toN(i+1, n);
    }
}
