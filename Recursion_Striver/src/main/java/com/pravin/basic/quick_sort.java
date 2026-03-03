package com.pravin.basic;

import static com.pravin.basic.ReverseArray.swap;

public class quick_sort {
    public static void main(String[] args) {
        int arr[] = {3,1,2,4,1,5,2,6,4};
        int low = 0,high = arr.length - 1;
        quickSort(arr,low,high);
        System.out.println("The sorted array is  :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high){
            int partIdx = partitionIndex(arr,low,high);
            quickSort(arr,low,partIdx-1);
            quickSort(arr,partIdx+1,high);
        }
    }

    private static int partitionIndex(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j){
            while (arr[i] <= pivot &&  i <= high - 1){
                i++;
            }
            while (arr[j] > pivot && j >= low + 1){
                j--;
            }
            if (i < j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }
}
