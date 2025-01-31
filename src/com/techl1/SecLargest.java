package com.techl1;

import java.util.Arrays;

public class SecLargest {

    public static void main(String[] args) {
        int[] arr = {12,2,3,4};
        int max = arr[0];
        int secLargest = -1;
        for(int  i = 1; i< arr.length ;i++) {
            if(arr[i] > max) {
                secLargest = max;
                max = arr[i];
            }
            if(arr[i] < max && arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }
        System.out.println(secLargest);
    }
}
