package com.wf.coding;

import java.util.Arrays;
import java.util.List;

public class ShiftRightZero {
    public static void main(String[] args) {
        int[] li = {1,0,2,3,0,0,4,5};

        int counts = li.length -1;

        for(int i = li.length-1 ; i >=0 ; i--) {
            if(li[i] != 0) {
                li[counts--] = li[i];
            }
        }
        while (counts >= 0) {
            li[counts--] = 0;
        }
        System.out.println(Arrays.toString(li));

//        int count = 0;
//
//        for(int i=0;i< li.length;i++) {
//            if(li[i] != 0) {
//                li[count++] = li[i];
//            }
//        }
//        while (count < li.length) {
//            li[count++] = 0;
//        }
//        System.out.println(Arrays.toString(li));
    }
}
