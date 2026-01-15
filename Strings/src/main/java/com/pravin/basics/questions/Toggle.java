package com.pravin.basics.questions;

import java.util.Scanner;

public class Toggle {
    private static void toggleUsingString(String sb) {
        System.out.println("the toggled string is : ");
        for (int i = 0; i < sb.length(); i++) {
            boolean flag = true; // capital
            char ch = sb.charAt(i);
            if (ch ==' ') continue;
            int ascii = (int) ch;
            if (ascii >= 97){
                flag = false;
            }
            if (flag){
                ascii = ascii + 32;
                char charAt = (char) ascii;
                sb = sb.substring(0,i) + charAt + sb.substring(i+1);
            }
            else {
                ascii-=32;
                char small = (char)ascii;
                sb = sb.substring(0,i) + small + sb.substring(i+1);
            }
        }
        System.out.println(sb);
    }
    private static void toggle(StringBuilder sb) {
        System.out.println("the toggled string is : ");
        for (int i = 0; i < sb.length(); i++) {
            boolean flag = true; // capital
            char ch = sb.charAt(i);
            if (ch ==' ') continue;
            int ascii = (int) ch;
            if (ascii >= 97){
                flag = false;
            }
            if (flag){
                ascii = ascii + 32;
                char charAt = (char) ascii;
                sb.setCharAt(i,charAt);
            }
            else {
                ascii-=32;
                char small = (char)ascii;
                sb.setCharAt(i,small);
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        String str = "PRaivin";
        toggleUsingString(str);
        toggle(sb);
    }

}
