package com.ArraysLeetCode;

import java.util.Arrays;

public class LeftRotateByOneIndex {

//    public static int[] rot(int[] arr,int pos) {
//        for(int i =)
//        for(int i=pos;i<arr.length;i++) {
//            arr[i-pos] = arr[i];
//        }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int temp = arr[0];

        for(int i=1;i<arr.length;i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }

}
