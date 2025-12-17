package org.example.basic_maths;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }

    private static boolean isPalindrome(int no) {
        int rev = 0;
        int temp = no;
        while (no > 0) {
            int ld = no % 10;
            rev = (rev * 10) + ld;
            no = no / 10;
        }
        return (temp == rev);
    }
}
