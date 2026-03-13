package com.pravin.basics.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s = "Amol";
        String k = "Amol";
        System.out.println(isAnagram(s,k));
        System.out.println(isAnagramSecond(s,k));
        System.out.println(isAnagramThird(s,k));
    }

    private static boolean isAnagram(String s,String k) {
        if (s.length() != k.length()) return false;
        char []a = s.toCharArray();
        char []b = k.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }
    private static boolean isAnagramSecond(String s,String k) {
        if (s.length() != k.length()) return false;

        int []freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[k.charAt(i) - 'a']--;
        }

        for(int  num : freq){
            if (num!=0){
                return false;
            }
        }

        return true;
    }
    private static boolean isAnagramThird(String s,String k) {
        if (s.length() != k.length()) return false;

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < k.length(); i++) {
            if (!map.containsKey(k.charAt(i))){
                return false;
            }
            map.put(k.charAt(i),map.get(k.charAt(i))-1);
            if (map.get(k.charAt(i)) == 0){
                map.remove(k.charAt(i));
            }
        }

        return map.isEmpty();
    }
}
