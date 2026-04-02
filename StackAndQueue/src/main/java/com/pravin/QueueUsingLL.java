package com.pravin;

public class QueueUsingLL {
    Node st;
    Node end;
    int size = 0;

    public void enqueue(int val) {
        Node temp = new Node(val);

        if (st == null) {
            st = temp;
            end = temp;
        } else {
            end.next = temp;
            end = temp;
        }
        size++;
    }

    public int dequeue() {
        if (st == null) {
            throw new java.util.NoSuchElementException("Queue is empty");
        }
        int poppedData = st.data;
        Node temp = st;
        st = st.next;
        temp.next = null;
        size--;

        if (st == null) {
            end = null;
        }

        return poppedData;
    }

    public void printQueue() {
        if (st == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node curr = st;
        System.out.print("Front -> ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println("<- Rear");
    }

    public static void main(String[] args) {
        QueueUsingLL queue = new QueueUsingLL();
        queue.enqueue(2);
        queue.enqueue(5);
        queue.printQueue();

        System.out.println("Dequeued: " + queue.dequeue());
        queue.printQueue();
    }
}