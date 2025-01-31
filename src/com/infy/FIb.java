package com.infy;

public class FIb {

    public static void fib(int n) {
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b);
        for(int i=0; i <= n ;i++) {
            int sum = a +b;
            System.out.print(" " +sum);
            a = b;
            b  = sum;
        }

    }

    public static void main(String[] args) {
        fib(5);

    }
}
