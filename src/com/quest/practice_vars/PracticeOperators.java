package com.quest.practice_vars;

public class PracticeOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
//        arithmetic operators
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a % b);
        System.out.println(a / b);
//        relational operators
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        boolean x = true;
        boolean y = false;
//        logical operators
        System.out.println(x && y);//and
        System.out.println(x || y);//or
        System.out.println(x != y);//not

        int z = 10;
        z += 5;//z=z+5
//        z -= 5;

//        unary operators
        System.out.println(z);
        System.out.println(z++);
        System.out.println(++z);
        System.out.println(z);
        System.out.println(z--);
        System.out.println(--z);
        System.out.println(z);

        int p = 10;
        int q = 5;
//        ternary operator
        int result = p > 15 ? ++q : 0;
        System.out.println(result);

    }
}
