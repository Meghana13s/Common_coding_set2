package com.wf.coding;

public class Palindrome {

    public static boolean checkPalindrome(String s) {
        String filteredInput = s.replaceAll("[a-zA-z]","");
        int left = 0;
        int right = filteredInput.length()-1;

        while (left < right) {
            if(filteredInput.charAt(left) != filteredInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "dad";
        String test1 = "A man, a plan, a canal, Panama";
        boolean res = checkPalindrome(s);
        boolean res1 = checkPalindrome(test1);
        System.out.println(res1);
        System.out.println(res);
    }
}
