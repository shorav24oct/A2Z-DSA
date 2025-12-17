package org.example.basic_maths;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigitUsingLog(1234567891));
    }

    private static int countDigit(int no) {
        int count = 0;
        while (no > 0) {
            no = no / 10;
            count++;
        }
        return count;
    }

    private static int countDigitUsingLog(double no) {
        int count = (int) Math.log10(no);
        return count + 1;
    }
}
