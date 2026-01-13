package array.TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    static void printMatrix(int [][] arr){
        System.out.println("The Matrix is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    private static long perCombination(int n ,int r){
        n = n - 1;
        r = r - 1;
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;

    }
    private static List<List<Long>> printPascalTriangle(int N) {
        List<List<Long>> ans = new ArrayList<>();

        for (int row = 1; row <= N; row++) {

            List<Long> temp = new ArrayList<>();

            for (int col = 1; col <= row; col++) {
                temp.add(perCombination(row, col));
            }
            ans.add(temp);

        }
        return ans;
    }
    private static void stdPascal(int n){
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i+1];
            ans[i][0] =  ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        printMatrix(ans);
    }
     static List<Long> optimalSol(int i){
        long ans = 1;
        List<Long> asR = new ArrayList<>();
        asR.add(ans);
        for (int col = 1; col < i ; col++) {
            ans = ans * (i - col);
            ans = ans/col;
            asR.add(ans);
        }
        return asR;
    }
     static List<List<Long>> solution(int N) {
        List<List<Long>> ans = new ArrayList<>();
        for (int i = 1; i <=N; i++) {
            ans.add(optimalSol(i));
        }
        return ans;
    }
    public static void prime(int n){
        if (n == 1)
            System.out.println("Ne prime nor even");

        /*
        for (int i = 2; i <= n; i++) {
            boolean check = false;
            for (int j = 2; j < i; j++) {
                if (n % i != 0) {
                    check = true;
                }
            }
            if (check== true){
                System.out.println("prime" +i);
            }
            else {
                System.out.println(" not prime" +i);
            }
        }

         */

        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag == true){
                System.out.println("pr"+i);
            }
            else {
                System.out.println("Not pri"+i);
            }
        }
    }
    public static void main(String[] args) {
        int R = 4;
        int N = 6;
        // Question type 1. return the number
        System.out.println("return the number : ");
        System.out.println(perCombination(3,2));
        System.out.println("__________________________________________");
        // for finding the nth row elements
        // Question type 2. return the row
        System.out.println("return the row : ");
        for (int col = 1; col <= N; col++) {
            System.out.print(perCombination(N,col) +" ");

        }
        // System.out.println("__________________________________________");
        // 3. Given N ,print entire triangle
        System.out.println("Given N = "+N+" , print entire triangle : ");
        for (List<Long> longs : printPascalTriangle(N)) {
            System.out.println(longs);
        }
        System.out.println("__________________________________________");

        System.out.println("Using the std : ");
        stdPascal(N);
        System.out.println("__________________________________________");
        System.out.println("Using the optimal solution : ");
        List<List<Long>> anns = solution(N);
        for (List<Long> i : anns){
            System.out.println(i);
        }
        System.out.println("__________________________________________");
        int n = 10;
        prime(n);
    }


    
}
