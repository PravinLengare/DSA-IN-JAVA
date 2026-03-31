package com.pravin;

import java.util.EmptyStackException;

public class StackUsingArray {
    public int st[] = new int[10];
    int top = -1;

    public void push(int el){
        if (top >= st.length - 1){
            System.out.println("Stack Overflow!");
            return;
        }
        st[++top] = el;
    }

    public int pop(){
        if (top == -1){
            throw new EmptyStackException();
        }
       return st[top--];
    }

    public int top(){
        if (top == -1){
            throw new java.util.EmptyStackException();
        }
        return st[top];
    }

    public int size(){
        return top+1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(st[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray();
        s.push(2);
        s.push(4);
        s.push(7);
        //System.out.println(s.pop());
        System.out.println(s.top());
        System.out.println(s.size());
        s.printStack();


        System.out.println();
    }


}
