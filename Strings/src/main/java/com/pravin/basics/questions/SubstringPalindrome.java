package com.pravin.basics.questions;

public class SubstringPalindrome {
    public static void main(String[] args) {
        String str = "abbd";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (isPalindrome(str.substring(i,j)) == true){
                    System.out.println(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println("The count of substring which are palindrome are :- "+count);

    }

    private static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() -1;
        while (i < j){
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
