package com.company.solutions;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        addTwoNumbers(l1, l2);
    }

    public static void addTwoNumbers(ListNode l1, ListNode l2) {
        String firstNumString = "";
        String secondNumString = "";
        String resultString = "";
        int firstNumInt;
        int secondNumInt;
        int result;
        ListNode answer;

        while(true){
            firstNumString = firstNumString.concat(String.valueOf(l1.val));
            if (l1.next == null){
                break;
            } else
                l1 = l1.next;
        }
        while(true){
            secondNumString = secondNumString.concat(String.valueOf(l2.val));
            if (l2.next == null){
                break;
            } else
                l2 = l2.next;
        }

        firstNumInt = Integer.parseInt(new StringBuilder(firstNumString).reverse().toString());
        secondNumInt = Integer.parseInt(new StringBuilder(secondNumString).reverse().toString());
        result = firstNumInt+secondNumInt;
        resultString = new StringBuilder(Integer.toString(result)).reverse().toString();

        for (int i = 0; i < resultString.length(); i++) {
            answer = new ListNode(Integer.parseInt(String.valueOf(resultString.charAt(i))));
        }

        System.out.println(result);
    }
}
