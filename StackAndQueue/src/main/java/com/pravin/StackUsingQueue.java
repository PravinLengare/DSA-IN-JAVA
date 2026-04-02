package com.pravin;

import java.util.LinkedList;
import java.util.Queue;
import java.util.EmptyStackException;

public class StackUsingQueue {

    private Queue<Integer> q = new LinkedList<>();

    public void push(int val) {
        q.add(val);

        int size = q.size();

        for (int i = 1; i < size; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        if (q.isEmpty()) {
            throw new EmptyStackException();
        }
        return q.remove();
    }

    public int top() {
        if (q.isEmpty()) {
            throw new EmptyStackException();
        }
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top());
        System.out.println("Popped: " + stack.pop());
        System.out.println("New Top: " + stack.top());
    }
}