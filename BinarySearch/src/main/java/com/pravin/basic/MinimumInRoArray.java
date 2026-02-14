package com.pravin.basic;

public class MinimumInRoArray {
    public static void main(String[] args) {
        int arr[] = {4,5,1,2,3};
        System.out.println(minInArray(arr));
        System.out.println(minInArrayWithDuplicates(arr));
    }

    private static int minInArray(int[] arr) {
        int low = 0,high = arr.length - 1;
        while (low < high){

            int mid = low + (high - low) / 2;
            if (arr[high] > arr[mid]) {
                high = mid;
            }
            else {
               low = mid + 1;
            }
        }
        return arr[low];
    }
    private static int minInArrayWithDuplicates(int[] arr) {
        int low = 0,high = arr.length - 1;
        while (low < high){
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[high]) {
                high = mid;
            }
            else if (arr[mid] > arr[high]) {
                low = mid + 1;
            }
            else {
                high--;
            }
        }
        return arr[low];
    }
}
