package com.pratice;

public class Palindrome {

    public static boolean chek(String s) {
        int left =0;
        int right = s.length()-1;

        while (left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "asdodsa";
        System.out.println(chek(s));

    }
}
