package com.subex.coding;

import java.util.Arrays;

public class ShiftZerosRight {

    public static void main(String[] args) {
        int[] li = {1,0,2,3,0,0,4,5};

        int countReverse = li.length-1;

        for(int i = li.length-1; i >= 0 ;i--) {
            if(li[i] != 0) {
                li[countReverse--] = li[i];
            }
        }
        while (countReverse >= 0) {
            li[countReverse--] = 0;
        }
        System.out.println(Arrays.toString(li));

//        int count = 0;
//
//        for(int i=0;i<li.length;i++) {
//            if(li[i] != 0 ) {
//                li[count++] = li[i];
//            }
//        }
//        while (count < li.length) {
//            li[count++] = 0;
//        }
//        System.out.println(Arrays.toString(li));
    }
}
