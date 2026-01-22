package com.pravin.SinglyLinkedList;


class Node{
    int data;
    Node next;

    Node(int data,Node next){
        this.data = data;
        this.next = null;
    }
    Node(int data){
        this.data = data;
    }
}
public class Basic2 {
    public static void main(String[] args) {
        Node n = new Node(3);
        Node n1 = new Node(4);
        Node n2 = new Node(5);
        n.next = n1;
        System.out.println(n.data);
        System.out.println(n.next.data);
        System.out.println(n2.data);
    }
}
