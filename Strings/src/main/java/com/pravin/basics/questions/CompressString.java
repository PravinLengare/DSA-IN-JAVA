package com.pravin.basics.questions;

public class CompressString {
    public static void main(String[] args) {
        String str = "aaaaabbbbcccce";

        String  ans = " "+str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (prev == curr){
                count++;
            }
            else{
                if (count > 1)
                    ans+= count;
                ans+= curr;
                count = 1;
            }
        }
        if (count > 1)
            ans+= count;
        System.out.println(ans);
    }
}
