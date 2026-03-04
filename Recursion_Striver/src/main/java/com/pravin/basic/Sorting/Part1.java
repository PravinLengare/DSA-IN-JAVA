package com.pravin.basic.Sorting;

import static com.pravin.basic.ReverseArray.swap;

public class Part1 {
    public static void main(String[] args) {
        int arr[] = {4,6,2,5,7,9,1,3};
        //int arr[] = {1,2,3,4};
        //selectionSort(arr);
        bubbleSort(arr);
        //insertionSort(arr);
        System.out.println("The sorted array is  :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = n-1; i >= 0; i--) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    flag = false;
                }
            }
            if (flag){  // for the sorted array O(N) complexity
                break;
            }
        }
    }

    // O(N2)
    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
