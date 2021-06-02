package com.company.solutions;

public class ReverseInteger {
    public static void main(String[] args) {
    }

    public static int reverse(int x) {
        int reverseInt = 0;
        try {
            reverseInt = Integer.parseInt(new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString());
        } catch (NumberFormatException e){
            return 0;
        }
        if (x >= 0) {
            return reverseInt;
        } else {
            return -reverseInt;
        }
    }
}
