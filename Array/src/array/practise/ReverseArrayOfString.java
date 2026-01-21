package array.practise;

import java.util.Scanner;

public class ReverseArrayOfString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 5;
        String []arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextLine();
        }
        reverseArray(arr);
    }
    public static void swap(String []arr,int i ,int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArray(String[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    private static void reverseArray(String[] arr) {
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
        printArray(arr);
    }
}
