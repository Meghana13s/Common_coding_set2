package com.ArraysLeetCode;

public class SecLargest {

    public static void main(String[] args) {
        int[] arr = {28078 ,19451, 935, 28892 ,2242, 3570 ,5480 ,231};
        int largest = arr[0];
        int secLargest = -1;

        int smallest = arr[0];
        int secSmallest = Integer.MAX_VALUE;

//        for(int i =1; i < arr.length;i++) {
//            if(arr[i] < smallest) {
//                 secSmallest = smallest;
//                smallest = arr[i];
//            } else if (arr[i] > smallest && arr[i] < secSmallest) {
//                secSmallest = arr[i];
//            }
//        }
//        System.out.println("second smallest : "+secSmallest);

        for(int i=1; i < arr.length;i++) {
            if(arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];

            } else if (arr[i] < largest && arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }
        System.out.println(secLargest);
    }
}

// optimal

