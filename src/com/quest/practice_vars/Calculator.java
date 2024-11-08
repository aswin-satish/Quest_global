package com.quest.practice_vars;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        double result = sc.nextDouble();
        boolean repeat = true;
        while (repeat) {
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Square Root");
            System.out.println("6.Clear");
            System.out.println("7.Exit");
            System.out.println("Enter your choice(1-8): ");
            int choice = sc.nextInt();
            int y = 0;
            switch (choice) {
                case 1:
                    System.out.println("Enter the number to add: ");
                    y = sc.nextInt();
                    result = result + y;
                    break;
                case 2:
                    System.out.println("Enter the number to subtract: ");
                    y = sc.nextInt();
                    result = result - y;
                    break;
                case 3:
                    System.out.println("Enter the number to multiply: ");
                    y = sc.nextInt();
                    result = result * y;
                    break;
                case 4:
                    System.out.println("Enter the number to divide: ");
                    y = sc.nextInt();
                    if (y == 0) {
                        System.out.println("Enter no zero number:");
                    }
                    result = result / y;
                    break;
                case 5:
                    if (result > 0)
                        result = Math.sqrt(result);
                    else {
                        System.out.println("Enter positive number");
                    }
                    break;
                case 6:
                    System.out.println("Clearing...");
                    result = 0;
                    break;
                case 7:
                    System.out.println("Do you want to continue?(y/n):");
                    char ch = sc.next().charAt(0);
                    if (ch == 'n') {
                        repeat = false;
                        System.exit(0);
                    } else {
                        System.out.println("Enter number: ");
                        result = sc.nextDouble();
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Your result is: " + result);
        }
    }
}