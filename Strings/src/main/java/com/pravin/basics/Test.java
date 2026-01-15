package com.pravin.basics;

public class Test {
    public static void main(String[] args) {
        String str = "Pravin";
        System.out.println(str.charAt(2));
        /**
         * IN THIS EXAMPLE STRING DOES NOT ,CHANGING BUT THE REFERENCE OF THE STRING IS CHANGING TO THE NEW STRING
         */
        str = str + '4';
        str+= "ABC";
        System.out.println(str);

        // Print all sub-strings
        String str1 = "abcd";
        for (int i = 0; i <= str1.length(); i++) {
            for (int j = i+1; j <= str1.length(); j++) {
                System.out.print(str1.substring(i,j)+" ");
            }
            System.out.println();
        }

        String s = "Amol";
        String s2 = new String("Amol");
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s.equals(s2));
        System.out.println(s == s2);

    }
}
/**
 * == -> this first checks the address if same return true else false (-- only address checks --)
 * but s.equals(s2) -> This also checks the address if false then checks the string char by char
 * intern() -> forces to check in the pool
 */
