package array.TwoDArray;

import java.util.Scanner;

public class SetMatrixToZero {
    public static void printArray(int[][]arr){
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void setToZeroUsingOptimal(int[][]a,int r,int c){
        int col0 = 1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == 0){
                     a[i][0] = 0;
                     if (j!=0)
                        a[0][j] = 0;
                     else
                         col0 = 0;
                }
            }
        }
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (a[i][j] !=0){
                    if (a[0][j] == 0 ||  a[i][0] == 0){
                        a[i][j] = 0;
                    }
                }
            }
        }
        if (a[0][0] == 0){
            for (int j = 0; j < c; j++) {
                a[0][j] = 0;
            }
        }
        if (col0 == 0){
            for (int i = 0; i < r; i++) {
                a[i][0] = 0;
            }
        }
        printArray(a);

    }
    public static void setToZeroUsingBetter(int[][]a,int r,int c){
        int n = a.length;
        int []row = new int[r];
        int []col = new int[c];


        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (row[i] == 1 || col[j] == 1){
                    a[i][j] = 0;
                }
            }
        }
        printArray(a);

    }
    public static void setToZero(int[][]a,int r,int c){

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 0){
                    markRow(a,c,i);
                    markCol(a,r,j);
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == -1){
                    a[i][j] = 0;
                }
            }
        }
        printArray(a);

    }
    public static void markRow(int [][]a,int c,int i){
        for (int j = 0; j < c; j++) {
            if (a[i][j] != 0){
                a[i][j] = -1;
            }
        }
    }
    public static void markCol(int [][]a,int r,int j){
        for (int i = 0; i < r; i++) {
            if (a[i][j] != 0){
                a[i][j] = -1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row 1");
        int r = sc.nextInt();
        System.out.println("enter the col 1");
        int c = sc.nextInt();
        int [][]a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();

            }
            System.out.println();
        }

        // setToZero(a,r,c);
        System.out.println("Using  the better one : ");
        // setToZeroUsingBetter(a,r,c);
        System.out.println("Using the optimal one : ");
        setToZeroUsingOptimal(a,r,c);
    }
}
