package org.example.recursion;

public class PrintSomething {

    public static void main(String[] args) {
        int count = 0;
        fun(count);
    }

    private static void fun(int count) {
        if (count == 3)
            return;
        System.out.println(count);
        count++;
        fun(count);
    }
}
