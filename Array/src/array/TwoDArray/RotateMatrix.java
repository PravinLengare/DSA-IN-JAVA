package array.TwoDArray;

import java.util.Scanner;

public class RotateMatrix {
    public static void printArray(int[][]arr){
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void swap(int [][]arr,int i,int j){

        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    public static void rev(int arr[]){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            swapForNormal(arr,i,j);
            i++;
            j--;
        }
    }

    private static void swapForNormal(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void rotateMatrix(int [][]arr,int r,int c){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                swap(arr,i,j);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            rev(arr[i]);
        }

        printArray(arr);
    }
    public static void rotateMatrixNormal(int [][]arr,int r,int c){
        int n = arr.length;
        System.out.println("Using the extra space : ");
        int [][]ans = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
               ans[j][n-i-1] = arr[i][j];
            }
        }

        printArray(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row 1");
        int r = sc.nextInt();
        System.out.println("enter the col 1");
        int c = sc.nextInt();
        int [][]arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();

            }
            System.out.println();
        }
//        System.out.println("using the optimal solution : ");
//        rotateMatrix(arr,r,c);
        System.out.println("using the brute force solution : ");
        rotateMatrixNormal(arr,r,c);
    }
}
