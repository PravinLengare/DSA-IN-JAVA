package com.pravin.basic;

import java.util.Scanner;

public class printTimes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        printName(n);
        printNumber(1,n);
        printReverse(n);
        System.out.println();
        printLinearlyBackTracking(n,n);
        System.out.println();
        printReverseBackTracking(1,n);
    }

    private static void printReverseBackTracking(int i, int n) {
        if (i > n){
            return;
        }
        printReverseBackTracking(i+1,n);
        System.out.print(i+" ");
    }

    private static void printName(int n) {
        if (n == 0){
            return;
        }
        System.out.println("Pravin");
        printName(n-1);
    }
    private static void printNumber(int i,int n) {
        if (i > n){
            return;
        }
        System.out.println(i);
        printNumber(i+1,n);

    }
    private static void printReverse(int n){
        if (n == 0){
            return;
        }
        System.out.print(n+" ");
        printReverse(n-1);
    }
    private static void printLinearlyBackTracking(int i,int n){
        if (i < 1){
            return;
        }
        printLinearlyBackTracking(i-1,n);
        System.out.print(i+" ");
    }

}
