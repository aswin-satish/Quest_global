package com.quest.practice_vars;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "  Hai  Hello  ";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf(' '));
        System.out.println(str.lastIndexOf('o'));
        System.out.println(str.substring(6));
        System.out.println(str.subSequence(6, 10));
        System.out.println(str2.trim());
        System.out.println(str2.replace('i', 'y'));
        System.out.println(str.concat(str2));
    }
}
