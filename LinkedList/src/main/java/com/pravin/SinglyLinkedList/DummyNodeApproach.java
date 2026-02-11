package com.pravin.SinglyLinkedList;

public class DummyNodeApproach {
    public static Node addTwoNumber(Node head1,Node head2){
        Node t1 = head1;
        Node t2 = head2;
        Node dummyNode = new Node(-1);
        Node curr = dummyNode;
        int carry = 0;
        while (t1 != null || t2 != null){
            int sum = carry;
            if (t1!=null)
                sum+= t1.data;
            if (t2!=null)
                sum+= t2.data;

            Node temp = new Node(sum % 10);
            carry = sum / 10;
            curr.next = temp;
            curr = curr.next;
            if (t1!=null) t1 = t1.next;
            if (t2!=null) t2 = t2.next;
        }
        if (carry > 0){
            Node newNode = new Node(carry);
            curr.next = newNode;
        }
        return dummyNode.next;
    }
    public static void main(String[] args) {
        Node t1 = new Node(1);
        Node t2 = new Node(2);
        Node t3 = new Node(3);
        Node t4 = new Node(4);
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;

        Node h1 = new Node(4);
        Node h2 = new Node(9);
        Node h3 = new Node(3);
        h1.next = h2;
        h2.next = h3;
        Node newNode = addTwoNumber(t1,h1);
        Node h = newNode;
        while (h!=null){
            System.out.print(h.data+" ");
            h = h.next;
        }
    }
}
