package com.subex.coding;
// time complexity : O(log n)
public class minArray {

    public static int findmin(int[]arr) {
        int left = 0; int right = arr.length-1; int min = Integer.MAX_VALUE;

        while (left <= right) {
            int mid = (left+right) / 2;

            if(arr[left] <= arr[right]) {
                min = Math.min(min,arr[left]);
                break;
            }
            if (arr[left] <= arr[mid]) {
                min = Math.min(min,arr[left]);
                left = mid +1;
            } else {
                min = Math.min(min, arr[mid]);
                right = mid - 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr1[] = {4,5,6,7,0,1,2};
        int arr2[] = {4,5,1,2,3};
        int arr3[] = {7,8,1,2,3,4,5,6};
        int res = findmin(arr3);
        System.out.println(res);
    }
}
