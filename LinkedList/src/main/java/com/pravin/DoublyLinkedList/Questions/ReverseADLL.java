package com.pravin.DoublyLinkedList.Questions;

import java.util.Stack;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data,Node next,Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    Node (int data){
        this.data = data;
    }
}
public class ReverseADLL {
    public static Node reverseADLL(Node head){
        Node temp = head;
        Stack<Integer> s = new Stack<>();
        while (temp!=null){
            s.push(temp.data);
            temp = temp.next;
        }
        // O(N)
        temp = head;
        while (temp!=null){
            temp.data = s.pop();
            temp = temp.next;
        }
        // O(N)

        // overall -> O(2N) time complexity and space complexity is O(N)
        return head;
    }
    public static Node reverseADLLWithSwapping(Node head){
        Node start = head;
        Node end = head;

        while (end.next!=null){     // O(N)
            end = end.next;
        }

        while (start != end && start.prev != end){     // O(N/2)
            int temp = start.data;
            start.data = end.data;
            end.data  = temp;

            start = start.next;
            end = end.prev;
        }
        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2,null,a);
        Node c = new Node(3,null,b);
        Node d = new Node(4,null,c);

        a.next = b;
        b.next = c;
        c.next = d;

        traverseDLL(a);
//        a = reverseADLL(a);
//        traverseDLL(a);

//        a = reverseADLLWithSwapping(a);
//        traverseDLL(a);


        a = reverseADLLWithSwappingThePointer(a);
        traverseDLL(a);


    }

    private static Node reverseADLLWithSwappingThePointer(Node head) {
        Node curr = head;
        Node last = null;

        while (curr!=null){
            last = curr.prev;
            curr.prev = curr.next;
            curr.next = last;

            curr = curr.prev;
        }
        return last.next;           // O(N)   AND O(1)
    }

    private static Node traverseDLL(Node head) {
        Node temp = head;
        System.out.print("NULL <-> ");
        while (temp!=null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
        return head;
    }
}
