package org.example.basic_maths;

public class PrimeNoCheck {
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }

    private static boolean isPrime(int no) {
        int count = 0;
        for (int i = 1; i * i <= no; i++) {
            if (no % i == 0)
                count++;
            if ((no / i) != i)
                count++;
        }
        return count == 2;
    }
}
