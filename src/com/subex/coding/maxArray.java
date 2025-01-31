package com.subex.coding;

public class maxArray {
    public static int findmax(int[]arr) {
        int left = 0; int right = arr.length-1; int max = Integer.MIN_VALUE;

        while (left <= right) {
            int mid  = (left + right) /2;

            if(arr[left] <= arr[right]) {
                max = Math.max(max,arr[right]);
                break;
            }
            if(arr[mid] >= arr[left]) {
                max= Math.max(max,arr[mid]);
                left = mid +1;
            } else {
                max = Math.max(max,arr[right]);
                right = mid -1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr1[] = {4,5,6,7,0,1,2};
        int arr2[] = {4,5,1,2,3};
        int arr3[] = {7,8,1,2,3,4,5,6};
        int res = findmax(arr1);
        System.out.println(res);
    }
}
