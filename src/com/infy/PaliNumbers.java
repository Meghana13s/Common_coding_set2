package com.infy;

public class PaliNumbers {

    public static boolean chec(int num) {
        if(num < 0) {
            return false;
        }
            int ori = num;
            int reverse = 0;
            while (num != 0 ) {
                int digit = num % 10; // last digit
                reverse = reverse * 10 + digit;
                num = num / 10;
            }


        return  ori == reverse;
    }

    public static void main(String[] args) {
        int i = 120921;
        chec(i);
        System.out.println(chec(i));
    }
}
