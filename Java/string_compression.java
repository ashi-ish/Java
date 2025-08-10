// Live Coding Question 1: “Custom String Compressor”
// Category: String Manipulation + Logic
// Estimated Time: 10–15 minutes
// Difficulty: Intermediate
// Problem Statement:
// Implement a method that takes a string and compresses it using the counts of
// repeated characters.
// For example, "aabcccccaaa" becomes "a2b1c5a3".
// If the compressed string is not shorter, return the original.
// Function Signature:
// public String compress(String input);

// Example:
// compress("aabcccccaaa") => "a2b1c5a3"
// compress("abc") => "abc"
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        StringBuilder compressed = new StringBuilder();
        String input = "aabbcc";
        char currentChar = input.charAt(0);
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (currentChar == input.charAt(i)) {
                count++;
            } else {
                compressed.append(currentChar).append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }
        compressed.append(currentChar).append(count);
        String result = compressed.toString();
        System.out.println(result.length() < input.length() ? result : input);
    }
}
