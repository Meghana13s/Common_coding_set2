package com.java8FInal;

import java.util.stream.IntStream;

public class Palindrome {


    static boolean check(String s) {
        int left = 0;
        int right = s.length() - 1;

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
        String s = "rotatore"; //
        boolean b = IntStream.range(0, s.length() / 2).noneMatch(x -> s.charAt(x) != s.charAt(s.length() - x - 1));
        System.out.println(b);
        System.out.println(check(s));
    }
}
