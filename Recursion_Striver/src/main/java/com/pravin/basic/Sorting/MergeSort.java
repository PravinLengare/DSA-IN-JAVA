package com.pravin.basic.Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {3,1,2,4,1,5,2,6,4};
        int low = 0,high = arr.length - 1;
        mergeSort(arr,low,high);
        System.out.println("The sorted array is  :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (low >= high){
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        mergeSortedArray(arr,low,mid,high);
    }

    private static void mergeSortedArray(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        List<Integer> list = new ArrayList<>();
        while (left <= mid && right <= high){
            if (arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }else {
                list.add(arr[right]);
                right++;
            }
        }
        while (left <= mid){
            list.add(arr[left]);
            left++;
        }
        while (right <= high){
            list.add(arr[right]);
            right++;
        }
        int idx = 0;
        for (int i = low; i <= high ; i++) {
            arr[i] = list.get(idx++);   // i - low
        }
    }
}
