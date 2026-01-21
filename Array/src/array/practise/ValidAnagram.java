package array.practise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println( checkAnagram(s,t));
        System.out.println( checkAnagramUsingArrays(s,t));
    }

    private static boolean checkAnagramUsingArrays(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] se = s.toCharArray();
        char[] te = t.toCharArray();
        Arrays.sort(se);
        Arrays.sort(te);
        return Arrays.equals(se,te);
    }

    private static boolean checkAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        boolean check = true;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (!t.contains(String.valueOf(ch))){
                    check = false;
                }
            }

        if(check){
            return true;
        }
        return false;
    }
}
