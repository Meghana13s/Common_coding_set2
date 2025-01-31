package com.pratice;

public class ArmStrong {

    public static void main(String[] args) {
        int num = 3709;

        int temp = num;
        int digits = 0;
        while (temp != 0) {
            temp = temp /10;
            digits++;
        }
        System.out.println(digits);

        temp = num;
        int sum =0;
        while (temp != 0) {
            int last = temp % 10;
            sum = (int) (sum + Math.pow(last,digits));
            temp = temp / 10;
        }

        if(sum == num ) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
