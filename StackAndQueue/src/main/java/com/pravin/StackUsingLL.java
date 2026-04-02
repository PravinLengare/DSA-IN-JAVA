package com.pravin;

class Node {
    int data;
    Node next;
    Node(int val) {
        this.data = val;
    }
}

public class StackUsingLL {
    Node top;
    int size = 0;

    public void push(int val) {
        Node node = new Node(val);
        node.next = top;
        top = node;
        size++;
    }

    public int pop() {
        if (top == null) {
            throw new java.util.EmptyStackException(); // Safety first!
        }
        int poppedData = top.data;

        Node temp = top;
        top = top.next;
        temp.next = null;
        size--;

        return poppedData;
    }

    public int peek() {
        if (top == null) {
            throw new java.util.EmptyStackException();
        }
        return top.data;
    }

    public void printStack() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }

        Node curr = top;
        System.out.print("Top -> ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingLL stackUsingLL = new StackUsingLL();
        stackUsingLL.push(2);
        stackUsingLL.push(3);
        stackUsingLL.push(6);

        System.out.println("Just popped: " + stackUsingLL.pop());

        stackUsingLL.printStack();
        System.out.println("Current Size: " + stackUsingLL.size);
    }
}