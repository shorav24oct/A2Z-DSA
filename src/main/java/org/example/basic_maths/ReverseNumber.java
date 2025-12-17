package org.example.basic_maths;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1463847412));
    }

    private static int reverse(int no) {
        int rev = 0;

        while (no != 0) {
            int lastDigit = no % 10;

            // 🔴 Overflow check BEFORE multiplying by 10
            if (rev > Integer.MAX_VALUE / 10) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = (rev * 10) + lastDigit;
            no = no / 10;
        }
        return rev;
    }
}
