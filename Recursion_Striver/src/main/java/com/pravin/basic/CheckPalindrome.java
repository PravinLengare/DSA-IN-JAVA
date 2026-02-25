package com.pravin.basic;

public class CheckPalindrome {
    public static void main(String[] args) {
        String[] s = {"m","a","d","a","m"};
        System.out.println(checkPalindrome(s,0));
    }

    private static boolean checkPalindrome(String[] s,int i) {
        int n = s.length;
        if (i >= n/2){
            return true;
        }
        if (!s[i].equals(s[n - i - 1])){
            return false;
        }
        return checkPalindrome(s,i+1);
    }
}
