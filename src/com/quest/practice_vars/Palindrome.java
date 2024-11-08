package com.quest.practice_vars;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s;
        String rev;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s = sc.nextLine();
        if (s == null) {
            System.out.println("The string is null");
            return;
        }
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reversed = sb.reverse();
        rev = reversed.toString();
        if (s.equalsIgnoreCase(rev)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}