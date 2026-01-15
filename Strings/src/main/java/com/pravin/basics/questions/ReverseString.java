package com.pravin.basics.questions;

public class ReverseString {
    public static StringBuilder reverseString(StringBuilder sb){
        int i = 0;
        int j = sb.length() - 1;
        while (i < j){
            char a = sb.charAt(i);
            char b = sb.charAt(j);
            sb.setCharAt(i,b);
            sb.setCharAt(j,a);
            i++;
            j--;
        }
       return sb;
    }
    public static void main(String[] args) {
        String str = "Amol";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(reverseString(sb));
    }
}
