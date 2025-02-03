package Strings;

import java.util.Stack;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        
        // Push all characters onto the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Pop characters and compare with the original string
        for (int i = 0; i < str.length(); i++) {
            if (stack.pop() != str.charAt(i)) {
                return false; // Not a palindrome
            }
        }
        
        return true; // It's a palindrome
    }

    public static void main(String[] args) {
        String str = "abcba";
        System.out.println("Is palindrome? " + isPalindrome(str));
    }
}
