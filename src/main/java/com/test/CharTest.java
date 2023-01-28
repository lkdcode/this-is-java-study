package com.test;

public class CharTest {
    public static void main(String[] args) {
        for (int i = args[0].length() - 1; i >= 0; i--) {
            System.out.print(Character.toUpperCase(args[0].charAt(i)));
        }
    }
}
