package com.pravin.questions;

import java.util.Stack;

public class BalancedParenthesis {

    public static void main(String[] args) {
        String s = "()[{}()])";
        System.out.println(checkBalanced(s));
        System.out.println(checkBalancedVersion(s));
    }

    private static boolean checkBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' ||  ch == '{'){
                stack.push(ch);
            }else {
                if (stack.empty())  return false;
                char ans = stack.pop();
                if(!(ans == '(' && ch == ')' || ans == '{' && ch == '}' || ans == '[' && ch == ']')){
                    return  false;
                }
            }

        }
        return stack.empty();
    }

    private static boolean checkBalancedVersion(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '('){
                stack.push(')');
            } else if (ch == '[') {
                stack.push(']');
            } else if (ch == '{') {
                stack.push('}');
            }
            else {
                if (stack.isEmpty() || stack.pop() != ch){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
