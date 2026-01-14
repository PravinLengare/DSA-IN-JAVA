package array.TwoDArray;

import java.util.Scanner;

public class RectangleSum {
    private static void rectangleSum(int[][] arr, int r1, int r2, int c1, int c2) {
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum+= arr[i][j];
            }
        }
        System.out.println("The sum is : "+sum);
    }
    private static void rectangleSumUsingPrefixUsingCol(int[][] arr, int r1, int r2, int c1, int c2) {
        int sum = 0,ans = 0 ,up = 0,left = 0,leftUp = 0;
        findPrefixSumArray(arr);
        sum = arr[r2][c2];
        if (c1 >= 1)
            left = arr[r2][c1-1];
        if (r1 >= 1)
            up = arr[r1-1][c2];
        if (r1 >=1 && c1>=1)
            leftUp = arr[r1-1][c1-1];
        ans = sum - left - up + leftUp  ;
        System.out.println("The sum is : "+ans);
    }

    private static void rectangleSumUsingPrefix(int[][] arr, int r1, int r2, int c1, int c2) {
        int sum = 0;
        findPrefixSumArray(arr);
        for (int i = r1; i <= r2 ; i++) {
            /**
             * this is the main condition if we are using the prefix sum array
             */
            if (c1 >= 1){
                sum+= arr[i][c2] - arr[i][c1-1];
            }
            else {
                sum+= arr[i][c2];
            }

        }
        System.out.println("The sum is : "+sum);
    }

    private static void findPrefixSumArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                arr[i][j]+= arr[i][j-1];
            }
        }

        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            for (int i = 1; i < rows; i++) {
                arr[i][j] += arr[i-1][j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row 1");
        int r = sc.nextInt();
        System.out.println("enter the col 1");
        int c = sc.nextInt();
        System.out.println("enter the r1 : ");
        int r1 = sc.nextInt();
        System.out.println("enter the r2 : ");
        int r2 = sc.nextInt();
        System.out.println("enter the c1 : ");
        int c1 = sc.nextInt();
        System.out.println("enter the c2 : ");
        int c2 = sc.nextInt();
        int [][]arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();

            }
            System.out.println();
        }

//        rectangleSum(arr,r1,r2,c1,c2);
//        System.out.println("------------------------------------------");
//        rectangleSumUsingPrefix(arr,r1,r2,c1,c2);
        rectangleSumUsingPrefixUsingCol(arr,r1,r2,c1,c2);
    }


}
