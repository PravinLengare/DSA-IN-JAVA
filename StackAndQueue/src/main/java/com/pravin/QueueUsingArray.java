package com.pravin;

public class QueueUsingArray {

    private int []st = new int[4];
    private int start = -1;
    private int end = -1;
    public int currSize = 0;
    int capacity = st.length;

    public void enqueue(int el) {
        if (currSize == st.length) {
            System.out.println("Queue is full!");
            return;
        }
        if (start == -1) { // First element inserted
            start = 0;
        }
        end = ( end+1) % capacity;
        st[end] = el;
        currSize++;
    }

    public int top() {
        if (currSize == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return st[start];
    }

    public int dequeue() {
        if (currSize == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        int removedElement = st[start];
        start = (start + 1) %  capacity;
        currSize--;

        if (currSize == 0) {
            start = -1;
            end = -1;
        }

        return removedElement;
    }

    public void printQueue() {
        if (currSize == 0) {
            System.out.println("Queue is empty");
            return;
        }
        int current = start;

        for (int i = 0; i < st.length; i++) {
            System.out.print(st[current] + " ");
            current = (current + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray();
        q.enqueue(3);
        q.enqueue(9);
        q.enqueue(10);
        q.enqueue(22);



        System.out.println("Dequeued: " + q.dequeue());
        q.enqueue(2);
        System.out.println("Top element: " + q.top());
        System.out.println("Current Size: " + q.currSize);

        q.printQueue();
    }
}