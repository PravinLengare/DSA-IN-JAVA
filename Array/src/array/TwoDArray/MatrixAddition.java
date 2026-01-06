package array.TwoDArray;

import java.util.Scanner;

public class MatrixAddition {
    public static void printArray(int[][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void additionMatrix(int [][]a, int [][]b, int row1, int col1,int row2,int col2){
        if (row2!=row1 || col2!=col1){
            return;
        }
        int [][]ans = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                ans[i][j] = a[i][j] + b[i][j];
            }
        }
        printArray(ans);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row 1");
        int r1 = sc.nextInt();
        System.out.println("enter the col 1");
        int c1 = sc.nextInt();
        System.out.println("enter the row 2");
        int r2 = sc.nextInt();
        System.out.println("enter the col 2");
        int c2 = sc.nextInt();
        int [][]a = new int[r1][c1];
        int [][]b = new int[r2][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();

            }
            System.out.println();
        }
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        additionMatrix(a,b,r1,c1,r2,c2);

    }
}
