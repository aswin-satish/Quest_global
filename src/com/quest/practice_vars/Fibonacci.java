package com.quest.practice_vars;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid Input,Enter +ve number");
            return;
        }
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Sequence upto " + n + "numbers: ");
        for (int i = 1; i <= n; i++) {
            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
