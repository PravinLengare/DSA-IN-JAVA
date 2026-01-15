package com.pravin.basics;

public class builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Pravin");
        sb.append("K");
        System.out.println(sb);
        sb.setCharAt(0,'R');
        sb.insert(0,'R');
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
        System.out.println(sb.reverse());


    }
}

/**
 * Strings are immutable
 * Performance issues
 * Memory wastage for every time new strings are going to generate
 * So, we have the string builder that is mutable ,and it has the methods to manipulate the strings
 * ----> A mutable sequence of characters. This class provides an API compatible with StringBuffer,
 * but with no guarantee of synchronization. This class is designed for use as a drop-in replacement for StringBuffer in places where the string buffer was being used by a single thread (as is generally the case). Where possible, it is recommended that
 * this class be used in preference to StringBuffer as it will be faster under most implementations.
 */