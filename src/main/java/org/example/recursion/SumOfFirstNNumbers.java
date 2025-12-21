package org.example.recursion;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int n = 4;
        sumOfNNumbers(n, sum);
    }

    private static void sumOfNNumbers(int n, int sum) {
        if ( n < 1) {
            System.out.println(sum);
            return;
        }
        sumOfNNumbers(n-1, sum + n);
    }
}
