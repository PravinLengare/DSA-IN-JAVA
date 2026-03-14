package com.pravin.basics.questions;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "prapin";
        System.out.println(findFirstChar(s));
    }

    private static int findFirstChar(String s) {
        int []freq = new int[26];
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            freq[c-'a']++;
        }
        for(int i = 0; i< s.length();i++){
            char c = s.charAt(i);
            if (freq[c-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
