package com.pratice;

public class Fib {

    public static void main(String[] args) {
        int n = 6;

        int first = 0;
        int sec = 1;
        System.out.print(first+" "+sec);

        for(int i =2;i<n;i++) {
            int sum = first + sec;
            System.out.print(" "+sum);
            first = sec;
            sec = sum;
        }

    }
}
