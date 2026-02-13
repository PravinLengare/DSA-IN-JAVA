package com.pravin.basic;

public class SearchInSortedRotatedArrayDuplicate {
    public static void main(String[] args) {
        int arr[] = {3,1,2,3,3,3,3};
        int k = 2;
        System.out.println(searchInRotatedArrayDuplicates(arr,k));
    }

    private static int searchInRotatedArrayDuplicates(int[] arr, int k) {
        int low = 0,high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] == k){
                return mid;
            }
            if(arr[mid] == arr[low] && arr[mid] == arr[high]){
                low++;
                high--;
            }
            else if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && arr[mid] > k){
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            } else{
                if (arr[mid] < k && k <= arr[high]){
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
