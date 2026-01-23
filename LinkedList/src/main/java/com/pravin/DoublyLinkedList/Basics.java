package com.pravin.DoublyLinkedList;
class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data,Node next,Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    public Node(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}
public class Basics {
    public static void main(String[] args) {
        /*
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;

        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(b.prev.data);
        System.out.println(b.next.data);
        System.out.println(c.prev.data);

         */

        int []arr = {1,2,3,4};
        Node head;
        head = convertToLL(arr);
        traverseDLL(head);

//        head = deleteHeadDLL(head);
//        traverseDLL(head);
//
//        head = deleteTailDLL(head);
//        traverseDLL(head);

        head = deleteAtKth(head,2);
        traverseDLL(head);

//        head = deleteNode(head);
//        traverseDLL(head);



        // ================== INSERTION IN LINKED LIST ===========================
        head = insertAtHead(head,9);
        traverseDLL(head);

        head = insertAtBeforeTail(head,10);
        traverseDLL(head);

        head = insertAtKthNode(head,5,11);
        traverseDLL(head);

        insertBeforeNode(head.next.next,2);
        traverseDLL(head);


    }

    private static void insertBeforeNode(Node node, int val) {
        Node prev = node.prev;
        Node newNode = new Node(val,node,prev);
        prev.next = newNode;
        node.prev = newNode;

    }

    private static Node insertAtKthNode(Node head, int k, int ele) {
        if (k == 1){
            return insertAtHead(head,ele);
        }
        int cnt = 0;
        Node temp = head;
        while (temp!=null){
            cnt++;
            if (cnt == k){
                break;
            }
            temp = temp.next;
        }
        if (temp == null){
            System.out.println("Position out of bounds!");
            return head;
        }
        Node prev = temp.prev;
        Node newNode = new Node(ele,temp,prev);
        prev.next = newNode;
        temp.prev = newNode;

        return head;
    }

    private static Node insertAtBeforeTail(Node head, int ele) {
        if (head == null) return new Node(ele);
        if (head.next == null) {
            return insertAtHead(head, ele);
        }
        /**
         * for at tail insertion
         */
//        Node temp = head;
//        while (temp.next!=null){
//            temp = temp.next;
//        }
//        Node newNode = new Node(ele,null,temp);
//        temp.next = newNode;
        Node tail = head;
        while (tail.next!=null){
            tail = tail.next;
        }
        Node prev = tail.prev;
        Node newN = new Node(ele,tail,prev);
        tail.prev = newN;
        prev.next = newN;

        return head;

    }

    private static Node insertAtHead(Node head,int ele) {
        if (head == null) return new Node(ele);
        Node newNode = new Node(ele,head,null);
        head.prev = newNode;
        head = newNode;
        return head;
    }

    private static Node deleteNode(Node temp) {
        Node prev = temp.prev;
        Node front = temp.next;
        if (front == null){
            prev.next = null;
            temp.prev = null;
            return temp;
        }
        prev.next = front;
        front.prev = prev;
        temp.next = null;
        temp.prev = null;
        return temp;
    }

    private static Node deleteAtKth(Node head,int k) {
        if (k == 1){
            return deleteHeadDLL(head);
        }
        Node temp = head;
        int cnt = 0;
        while (temp!=null){
            cnt++;
            if (k == cnt){
                break;
            }
            temp = temp.next;
        }
        Node prev;
        Node front;
        prev = temp.prev;
        front = temp.next;

        if (prev == null && front == null){
            deleteHeadDLL(head);
        } else if (prev == null) {
            return deleteHeadDLL(head);
        } else if (front == null) {
            return deleteTailDLL(head);
        }
        else {
            prev.next = front;
            front.prev = prev;
            temp.next = null;
            temp.prev = null;
        }
        return head;
    }

    private static Node deleteTailDLL(Node head) {
        if (head == null) return null;
        if (head.next == null) return null;

        Node tail = head;
        while (tail.next!=null){
            tail = tail.next;
        }
        Node p = tail.prev;
        p.next = null;
        tail.prev = null;
        return head;
    }

    private static Node deleteHeadDLL(Node head) {
        if (head == null) return head;
        if (head.next == null) return null;
        Node prev = head;
        head = head.next;
        prev.next = null;
        head.prev = null;
        return head;

    }

    private static void traverseDLL(Node head) {
        Node temp = head;
        System.out.print("NULL <- ");
        while (temp!=null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    private static Node convertToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
}
