package org.example.basic_maths;

public class PrintAllDivisors {
    public static void main(String[] args) {
        printDivisors(36);
    }

    /*
    Time Complexity: Big-O(n)
     */
    private static void printDivisors(int no) {
        for (int i = 1; i <= no; i++) {
            if (no % i == 0)
                System.out.print(i + " ");
        }
    }
}
