package com.pravin.SinglyLinkedList;

public class ReverseLL {
    public static void main(String[] args) {
        Node t1 = new Node(1);
        Node t2 = new Node(2);
        Node t3 = new Node(3);
        Node t4 = new Node(4);
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        Node ans = reverseLL(t1);
        Node temp = ans;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    private static Node reverseLL(Node head) {
        Node curr = head;
        Node prev = null;

        while (curr!= null){
            Node after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;

    }
}
