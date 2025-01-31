package com.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String[] args) {
        String s = "ROTATOR";
        IntStream range = IntStream.range(0, s.length() / 2);

        System.out.println(Arrays.toString(range.toArray()));
        System.out.println(s.length()/2);

        boolean b = IntStream.range(0, s.length() / 2).noneMatch(x -> s.charAt(x) != s.charAt(s.length() - x - 1));
        System.out.println(b);

//        int left = 0 ;
//        int right = s.length()-1;
//
//        while(left < right) {
//            if(s.charAt(left) != s.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;

    }
}
