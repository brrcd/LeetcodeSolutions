package com.company.solutions;

public class PalindromeNumber {
    public static void main(String[] args) {
        int ttr = 4434;
        int ttt = 44544;
        int tttf = -44544;
        System.out.println(isPalindrome(ttr));
        System.out.println(isPalindrome(ttt));
        System.out.println(isPalindrome(tttf));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            String stringX = Integer.toString(x);
            for (int i = 0; i < stringX.length(); i++) {
                if (stringX.charAt(i) != stringX.charAt(stringX.length() - 1 - i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
