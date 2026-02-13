package com.pravin.basic;

public class FirstAndLastOccurrences {
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,40,50};
        int k = 0;
        int[] ans = firstAndLastOccurr(arr,k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    private static int[] firstAndLastOccurr(int[] arr, int k) {
        int firstOccurrence = firstOccur(arr,k);
        int lastOccurrence = lastOccurr(arr,k);

        return new int[]{
                firstOccurrence,
                lastOccurrence
        };
    }

    private static int lastOccurr(int[] arr, int k) {
        int low = 0,high = arr.length - 1;
        int last = -1;
        while (low <= high){
            int mid = low + (high - low) /2;
            if (arr[mid] == k){
                last = mid;
                low = mid + 1;
            } else if (arr[mid] > k) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return last;
    }

    private static int firstOccur(int[] arr, int k) {
        int low = 0,high = arr.length - 1;
        int first = -1;
        while (low <= high){
            int mid = low + (high - low) /2;
            if (arr[mid] == k){
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return first;
    }
}
