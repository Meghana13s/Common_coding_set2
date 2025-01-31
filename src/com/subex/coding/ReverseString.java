package com.subex.coding;

public class ReverseString {
    public static void main(String[] args) {
        String s  = "hello world";

        char[] chararr = s.toCharArray();
        String reverse = "";

        for(int i=chararr.length-1;i>=0;i--) {
            reverse = reverse + chararr[i];
        }
        System.out.println(reverse);
    }
}
