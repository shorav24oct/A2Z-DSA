package org.example.recursion;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int n = 5;
        sumOfNNumbers(n, sum);
        System.out.println(sumOfN(5));
    }

    private static void sumOfNNumbers(int n, int sum) {
        if ( n < 1) {
            System.out.println(sum);
            return;
        }
        sumOfNNumbers(n-1, sum + n);
    }

    private static int sumOfN(int N) {
        if (N == 0)
            return 0;

        return N + sumOfN(N - 1);
    }
}
