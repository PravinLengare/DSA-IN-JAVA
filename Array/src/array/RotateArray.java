package array;

import java.util.Scanner;

public class RotateArray {
    public static void printArray(int arr[]){
        int n = arr.length;
        System.out.println("The array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotateArray(int[] arr ,int k){
        int n = arr.length;
        int ans[] = new int[n];
        k = k % n;
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n-k; i++) {
            ans[j++] = arr[i];
        }
        System.out.println("Array after rotating k = "+ k );
        printArray(ans);
    }
    public static void rev(int[] arr,int i,int j){
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void rotateArrayInPlace(int []arr,int k){
        int n = arr.length;
        k = k % n;

        rev(arr,0,n-k-1);
        rev(arr,n-k,n-1);
        rev(arr,0,n-1);

        printArray(arr);

    }
    public static void main(String[] args) {
        System.out.println(" no of elements should be : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("enter no of elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the k number :");
        int k = scanner.nextInt();
        System.out.println("Rotate a array by k times :");
        rotateArray(arr,k);
        System.out.println();
        System.out.println("Without extra space : ");
        rotateArrayInPlace(arr,k);

    }
}
