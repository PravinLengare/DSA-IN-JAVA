package com.pravin.basic;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr = {2,9,3,4,5};
        int l = 0,r = arr.length - 1;
        //reverseArray(arr,l,r);
        reverseArrayUsingSingleVar(arr,0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverseArray(int[] arr,int l ,int r) {
        if (l >= r){
            return;
        }
        swap(arr,l,r);
        reverseArray(arr,l+1,r-1);
    }
    private static void reverseArrayUsingSingleVar(int[] arr,int i) {
        int n = arr.length;
        if (i >= n/2){
            return;
        }
        swap(arr,i,n-i-1);
        reverseArrayUsingSingleVar(arr,i+1);
    }
}
