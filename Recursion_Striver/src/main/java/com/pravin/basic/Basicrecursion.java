package com.pravin.basic;

public class Basicrecursion {
    public static void main(String[] args) {
        int cnt = 0;
        printMe(cnt);
    }

    private static void printMe(int cnt) {
        if (cnt == 3){
            return;
        }
        cnt++;
        System.out.println("pravin");
        printMe(cnt);
    }
}
