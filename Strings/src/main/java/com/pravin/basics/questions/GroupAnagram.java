package com.pravin.basics.questions;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

        List<List<String>> result = groupAnagram(list);
        System.out.println(result);
    }

    private static List<List<String>> groupAnagram(List<String> list) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : list) {
            int[] freq = new int[26];
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }
            String key = Arrays.toString(freq);

            // Java 8 Shortcut: If key doesn't exist, create an empty list, then add the word
           //map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}