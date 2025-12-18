package org.example.basic_maths;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisors {
    public static void main(String[] args) {
        printDiv(36);
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

    /*
    Time Complexity: Big-O(sqrt(n))
     */
    private static void printDiv(int no) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= no; i++) {
            if (no % i == 0) {
                list.add(i);
                if ((no / i) != i) {
                    list.add(no / i);
                }
            }
        }
        list.stream().sorted().forEach(System.out::println);
    }
}
