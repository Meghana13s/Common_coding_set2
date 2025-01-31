package com.subex.coding;

public class FindAnyRotatedArray {

    public static int find(int[] arr , int target) {
        int left =0; int right = arr.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == target) {
                return mid;
            }
            if (arr[mid] >= arr[left]) {
                if(arr[left] <= target  && target <= arr[mid]){
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            } else {
                if(arr[mid] <= target && target <= arr[right] ) {
                    left = mid +1;
                } else {
                    right = mid -1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {6,7,8,9,10,11,0,1,2,3};
        int target = 0;
        int res = find(arr,target);
        System.out.println(res);


    }
}
