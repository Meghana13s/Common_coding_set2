package com.pratice;

public class PrimeNo {

    public static void main(String[] args) {
        int num = 17;
        boolean flag = false;

        for(int i = 2;i < num/2;i++) {
            if(num % i == 0) {
                flag = true;
                System.out.println("it's not a prime");
                break;
            }
        }

        if(!flag) {
            System.out.println("i'ts prime");
        }

    }
}
