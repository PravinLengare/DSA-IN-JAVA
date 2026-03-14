package com.pravin;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        int q = 5;
        Scanner s = new Scanner(System.in);
        int []arr = {1,2,1,3,4};
        int hash[] = new int[13];

        //pre-computation
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        while (q-- > 0){
            int n = s.nextInt();
            // fetching
            int count = hash[n];
            System.out.println("the count for the n is "+count);
        }
    }




    }

