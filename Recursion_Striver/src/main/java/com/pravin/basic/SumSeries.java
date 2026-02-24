package com.pravin.basic;

public class SumSeries {
    public static void main(String[] args) {
        int N = 4;
        numSeriesSum(N,0);
        System.out.println( "Sum is :"+numSeriesSumFun(N));

        System.out.println(factorial(N));
    }

    private static int factorial(int n) {
        if (n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }

    // parameterized way
    private static void numSeriesSum(int n, int i) {
        if (n < 1){
            System.out.println("Sum is "+ i);
            return;
        }
        numSeriesSum(n-1,i + n);
    }
    // functional way
    private static int numSeriesSumFun(int n) {
        if (n == 0){
            return 0;
        }
        return n + numSeriesSumFun(n-1);
    }
}
