package com.subex.coding;

import java.util.ArrayList;

public class MergeSort1 {

    public static void merge(int[] arr,int low, int mid,int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low; int right = mid+1;

        while(left <= mid &&  right <= high) {
            if(arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for(int i =low;i<=high;i++) {
            arr[i] = temp.get(i-low);
        }
    }
    public static void sort(int[] arr, int low, int high) {
        if(low>=high) return;
        int mid  = (low + high) /2;
        sort(arr,low,mid);
        sort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        sort(arr,0,arr.length-1);
        System.out.println("sorted...");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
