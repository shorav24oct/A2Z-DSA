package org.example.basic_maths;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(123456));
    }

    private static int reverse(int no) {
        int rev = 0;
        while (no > 0) {
            int ld = no % 10;
            rev = (rev * 10) + ld;
            no = no / 10;
        }
        return rev;
    }
}
