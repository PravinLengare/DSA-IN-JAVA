package array.TwoDArray;

import java.util.Scanner;

public class SpiralPrinting {

    public static void printSpiral(int[][] arr,int r,int c){
        int n = arr.length;
        int top = 0, bottom = r - 1;
        int left = 0, right = c - 1;
        int  elements = 0;
        System.out.println("The spiral printing of the matrix is :-> ");
        while(elements <= r*c){

            // left - > right printing
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i]+" ");
                elements++;
            }

            top++;

            // top - > bottom printing
            for (int j = top; j <= bottom; j++) {
                System.out.print(arr[j][right]+" ");
                elements++;
            }
            right--;

            // right - > left
            for (int i = right; i >= left; i--) {
                System.out.print(arr[bottom][i]+" ");
                elements++;
            }
            bottom--;

            // right - > left
            for (int j = bottom; j >= top; j--) {
                System.out.print(arr[j][left]+" ");
                elements++;
            }
            left++;

        }
        System.out.println();

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

        printSpiral(arr,r,c);
    }
}
