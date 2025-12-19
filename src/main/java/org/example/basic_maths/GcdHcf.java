package org.example.basic_maths;

public class GcdHcf {
    public static void main(String[] args) {
        System.out.println(printGcdOrHcf(11, 13));
    }

    private static int printGcdOrHcf(int n1, int n2) {
        int gcd = 0;
        for (int i = Math.min(n1, n2); i >= 1; i--) {
            if ( (n1 % i == 0) && (n2 % i == 0) ) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}
