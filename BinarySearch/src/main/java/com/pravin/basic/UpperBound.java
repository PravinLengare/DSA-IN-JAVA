package com.pravin.basic;

public class UpperBound {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,5};
        int target = 1;
        System.out.println(upperBound(arr,target));
    }

    private static int upperBound(int[] arr, int target) {
        int low = 0,high = arr.length - 1;
        int ans = arr.length;
        while (low <= high){
            int mid = low + (high-low)/2;
            if (arr[mid] > target){
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
