package com.pravin.basic;

public class FloorBound {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int target = 25;
        System.out.println(floorBinary(arr,target));
    }
    private static int floorBinary(int[] arr, int target) {
        int low = 0,high = arr.length - 1;
        int ans = arr.length;
        while (low <= high){
            int mid = low + (high-low)/2;
            if (arr[mid] <= target){
                ans = arr[mid];
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
}
