package org.example.basic_maths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(163));
    }

    private static boolean isArmstrongNumber(int no) {
        int temp = no;
        int sum = 0;
        while (no > 0) {
            int noOfDigit = CountDigits.countDigit(temp);
            int ld = no % 10;
            sum = sum + (int) Math.pow(ld, noOfDigit);
            no = no / 10;
        }
        return (temp == sum);
    }
}
