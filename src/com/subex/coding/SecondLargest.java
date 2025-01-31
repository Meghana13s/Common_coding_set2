package com.subex.coding;

public class SecondLargest {

    public static void main(String[] args) {
        int arr[] = {7,2,3,4,1,9};
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length;i++) {
            if(largest < arr[i]) {
                secLargest = largest;
                largest = arr[i];
            } else if (largest > arr[i] && secLargest < arr[i]) {
                secLargest = arr[i];
            }
        }
        System.out.println(secLargest);

    }
}
