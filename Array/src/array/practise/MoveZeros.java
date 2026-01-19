package array.practise;

import java.util.Scanner;

import static array.PrefixSum.printArray;

public class MoveZeros {
    public static void printArray(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void move(int[]arr){
        int slow = 0;
        int fast = 1;
        while (slow < fast && fast < arr.length){
            if (arr[fast]!=0){
                swap(arr,slow,fast);
                slow++;
                fast++;
            }
            else {
                fast++;
            }
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        System.out.println(" no of elements should be : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        System.out.println("enter no of elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        move(arr);
    }
}
