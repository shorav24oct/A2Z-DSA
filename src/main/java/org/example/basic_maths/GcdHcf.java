package org.example.basic_maths;

public class GcdHcf {
    public static void main(String[] args) {
        System.out.println(printGCD(11, 13));
    }

    /*
    Time Complexity: Big-O(min(n1,n2))
     */
    private static int printGcdOrHcf(int n1, int n2) {
        int gcd = 0;
        for (int i = Math.min(n1, n2); i >= 1; i--) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    /*
    Euclidean algorithm
    Time Complexity: Big-O(log(min(n1,n2)))
     */
    static int printGCD(int n1, int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2)
                n1 = n1 % n2;
            else
                n2 = n2 % n1;
        }
        if (n1 == 0)
            return n2;
        else
            return n1;
    }
}
