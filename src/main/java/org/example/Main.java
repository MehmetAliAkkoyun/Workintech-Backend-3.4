package org.example;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));                 // true
        System.out.println(checkForPalindrome("Racecar"));                       // true
        System.out.println(checkForPalindrome("hello"));                         // false
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?")); // true
        System.out.println(checkForPalindrome("Test"));                          // false
        System.out.println(checkForPalindrome("Welcome"));                       // false

        System.out.println(convertDecimalToBinary(5));   // 101
        System.out.println(convertDecimalToBinary(6));   // 110
        System.out.println(convertDecimalToBinary(13));  // 1101
    }

    public static boolean checkForPalindrome(String input) {

        String cleaned = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;


        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    public static String convertDecimalToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();


        while (decimal > 0) {
            stack.push(decimal % 2);
            decimal = decimal / 2;
        }


        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}