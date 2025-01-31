package com.subex.coding;

public class GrayCodeChecker {

    // Method to check if two binary numbers are in Gray code series with difference of 1
    public static int isGrayCodeDifferenceOne(String bin1, String bin2) {
        // Convert binary strings to integers
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);

        // Find XOR of the two numbers
        int xorResult = num1 ^ num2;

        // Check if XOR result has exactly one bit set (i.e., difference of 1)
        if (xorResult != 0
                && (xorResult & (xorResult - 1)) == 0) {
            return 1; // They differ by exactly one bit (Gray code)
        }
        return 0; // They do not differ by exactly one bit
    }

    public static void main(String[] args) {
        // Example binary numbers
        String bin1 = "1010"; // Binary for 10
        String bin2 = "1011"; // Binary for 11

        // Check if they differ by exactly 1 bit
        int result = isGrayCodeDifferenceOne(bin1, bin2);
        System.out.println(result); // Output: 1, since 10 and 11 differ by exactly one bit

        // Another test case
        bin1 = "1100"; // Binary for 12
        bin2 = "1001"; // Binary for 9
        result = isGrayCodeDifferenceOne(bin1, bin2);
        System.out.println(result); // Output: 0, since 12 and 9 differ by more than one bit
    }
}
