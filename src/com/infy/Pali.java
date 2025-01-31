package com.infy;

public class Pali {
    public static boolean checkPali(String s) {
        s=s.replaceAll("\\s+","").toLowerCase();
        int left = 0;
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
        String s = "abmmba";
        String s1 = "12321";

        System.out.println(checkPali(s1));

    }
}
