package org.example.recursion;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "madzm";
        System.out.println(palindrome(str, 0));
    }

    private static boolean palindrome(String s, int i) {
        if (i >= (s.length() / 2))
            return true;

        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;

        return palindrome(s, i + 1);
    }
}
