package com.techl1;

import java.util.Arrays;

public class ShiftZerosRight {

    public static void main(String[] args) {
        int[] arr = {1,0,3,4,0,2};

        int count  = arr.length-1 ; //int count  = 0;

        for (int i=arr.length-1 ; i >=0 ;i--) {
            if(arr[i] != 0) {
                arr[count--] = arr[i];
            }
        }

        while (count >= 0) {
            arr[count--] = 0;
        }

//        for(int i=0;i<arr.length;i++) {
//            if(arr[i] != 0) {
//                arr[count++] = arr[i];
//            }
//
//        }
//        while (count < arr.length) {
//            arr[count++] = 0;
//        }

        System.out.println(Arrays.toString(arr));
    }
}
