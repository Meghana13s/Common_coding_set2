package com.pratice;

public class PalindromeNumber {

    public static void check(int num) {
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int last = temp % 10;
            rev = rev * 10 + last;
            temp = temp / 10;
        }
        if(rev==num) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        int i = 128021;
        check(i);
    }
}
