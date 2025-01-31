package com.subex.coding;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 17;
        boolean found  = false;

        for(int i = 2 ; i < num/2 ; i++) {
            if(num % i == 0) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("it's not a prime");
        } else {
            System.out.println("it's prime");
        }
    }
}
