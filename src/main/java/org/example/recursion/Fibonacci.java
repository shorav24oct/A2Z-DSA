package org.example.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    private static int fib(int i) {
        if (i <= 1)
            return i;

        int last = fib(i - 1);
        int sLast = fib(i - 2);

        return last + sLast;
    }
}
