package com.elite;

public class Calc {
    public int calculate(int data) {
        int result = 0;
        for (int i = 1; i <= data; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }
}
