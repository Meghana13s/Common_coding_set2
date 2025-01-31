package com.subex.coding;

public class BinarySearch {

    public static int find(int arr[] , int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1; // when not found
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8};
        int target = 10;
        int res= find(arr ,target);
        System.out.println(res);


    }
}
