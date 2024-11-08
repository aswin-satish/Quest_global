package com.quest.practice_vars;

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        while (number != 0) {
            int ld = number % 10;
            sum = sum + ld;
            number /= 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}
