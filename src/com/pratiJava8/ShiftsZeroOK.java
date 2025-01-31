package com.pratiJava8;

import java.util.Arrays;

public class ShiftsZeroOK {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,4};
//        int count=0;
//        for(int i=0;i<arr.length;i++) {
//            if(arr[i] != 0) {
//                arr[count++] = arr[i];
//            }
//        }
//        while (count < arr.length) {
//            arr[count++] = 0;
//        }

        int revCount = arr.length-1;
        for(int i = revCount ; i >=0 ;i--) {
            if(arr[i] != 0) {
                arr[revCount--] = arr[i];
            }
        }
        while (revCount >= 0) {
            arr[revCount--] = 0;
        }


        System.out.println(Arrays.toString(arr));
    }
}
