// Live Coding Question 2: “Balanced Brackets Validator”
// Category: Stack + Collections
// Estimated Time: 15 minutes
// Difficulty: Intermediate
// Problem Statement:
// Write a method that checks whether a given string has balanced brackets.
// The string may contain (), {}, and []. All brackets must be closed in the
// correct order.
// Function Signature:
// public boolean isBalanced(String expression);

// Example:
// isBalanced("{[()]}") => true
// isBalanced("{[(])}") => false
// isBalanced("((()))") => true

import java.util.Stack;

class Main {
    public static void main(String[] args) {
        String input = "{[(])}";
        boolean result = isBalanced(input);
        System.out.println("Is balanced: " + result);
    }

    public static boolean isBalanced(String input) {
        Stack<String> paranthesis = new Stack<String>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{') {
                paranthesis.push(String.valueOf(input.charAt(i)));
            } else {
                if (paranthesis.isEmpty()) {
                    System.out.println("Unbalanced brackets");
                    return false;
                } else {
                    if (paranthesis.peek().equals("(") && input.charAt(i) == ')') {
                        paranthesis.pop();
                    } else if (paranthesis.peek().equals("[") && input.charAt(i) == ']') {
                        paranthesis.pop();
                    } else if (paranthesis.peek().equals("{") && input.charAt(i) == '}') {
                        paranthesis.pop();
                    } else {
                        System.out.println("Unbalanced brackets");
                        return false;
                    }
                }
            }
        }
        return paranthesis.isEmpty();
    }
}