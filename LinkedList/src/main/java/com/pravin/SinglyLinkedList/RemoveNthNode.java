package com.pravin.SinglyLinkedList;

public class RemoveNthNode {
    public static void main(String[] args) {
        Node t1 = new Node(1);
        Node t2 = new Node(2);
        Node t3 = new Node(3);
        Node t4 = new Node(4);
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        //Node ans = removeNthNode(t1,4);
        Node ans = removeNthNodeOptimize(t1,2);
        Node temp = ans;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static int lLength(Node head){
        Node temp = head;
        int cnt = 0;
        while (temp!=null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
    public static Node removeNthNode(Node head,int n){
        if (head == null){
            return null;
        }

        int length = lLength(head);
        if (length == n){
           return head.next;
        }
        Node temp = head;

        for(int i = 1; i < length - n; i++){
            temp = temp.next;
        }

        Node deleteNode = temp.next;
        temp.next = temp.next.next;

        return head;
    }
    public static Node removeNthNodeOptimize(Node head,int n){
        if (head == null){
            return null;
        }
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null){
            return head.next;
        }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        Node deleteNode = slow.next;
        slow.next = slow.next.next;

        return head;
    }
}
