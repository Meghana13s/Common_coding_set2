package com.ArraysLeetCode;

public class LeftRotateByOneIndex2 {

    public static void reverse(int[] arr,int start,int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] arr, int n, int pos) {
        reverse(arr,0,pos-1);
        reverse(arr,pos,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int pos = 16;
        if(pos > n) {
            pos = pos % n;
            rotate(arr, n, pos);
            System.out.print("After Rotating the k elements to left ");
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        } else {
            rotate(arr, n, pos);
            System.out.print("After Rotating the k elements to left ");
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }


    }
}
