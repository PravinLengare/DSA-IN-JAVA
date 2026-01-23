package com.pravin.SinglyLinkedList;
class Node1{
    int data;
    Node1 next;

    Node1(int data,Node1 next){
        this.data = data;
        this.next = next;
    }
    Node1(int data){
        this.data = data;
    }
}
public class Practice {
    public static void main(String[] args) {
        /*
        Node1 n = new Node1(3);
        Node1 a = new Node1(6);
        Node1 b = new Node1(8);
        Node1 c = new Node1(5);
        n.next = a;
        a.next = b;
        b.next = c;
        System.out.println(n.data);
        System.out.println(n.next.data);
        // System.out.println(a.data);
        System.out.println(n.next.next.data);
        System.out.println(n.next.next.next.data);

         */

        /*
        int []arr = {1,2,3,4};
        Node head = arrayToLL(arr);
        //traverse(head);
        //System.out.println("-------");
        System.out.print(searchEle(head,6));
        System.out.println();
        System.out.print(lengthLL(head));

         */


        Node1 a = new Node1(3);
        Node1 b = new Node1(6);
        Node1 c = new Node1(9);
        a.next = b;
        b.next = c;


        /**
         * delete at head
         */
//        a = deleteHead(a);
//        traverse(a);

        /**
         * delete at last
         */

//        traverse(a);
//        a = deleteLast(a);
//        traverse(a);

        /**
         * delete at middle
         */
        /*
        System.out.println("After deletion :");
        a = deleteMiddle(a,3);
        traverse(a);

         */



        /**
         * Insertion three types
         * 1. at head
         * 2. at tail
         * 3. at given count
         */

//        a = insertAtHead(a,4);
//        traverse(a);
//
//        a = insertAtTail(a,6);
//        traverse(a);
        traverse(a);

        a = insertAtKth(a,4,0);
        traverse(a);
    }

    private static Node1 insertAtKth(Node1 head, int k,int ele) {
        if (k <= 0) {
            System.out.println("please enter the valid position");
            return head;
        }
        if (head == null) {
            if (k == 1) return new Node1(ele);
            System.out.println("please enter the valid position");
            return null;
        }
        if (k == 1){
            Node1 newNode = new Node1(ele);
            newNode.next = head;
            return head = newNode;
        }
        Node1 temp = head;
        int cnt = 1;

        while (temp != null) {
            if (cnt == k - 1) {
                Node1 newNode = new Node1(ele);
                newNode.next = temp.next;
                temp.next = newNode;
                return head;
            }
            temp = temp.next;
            cnt++;
        }

        System.out.println("please enter the valid position");
        return head;
    }

    private static Node1 insertAtTail(Node1 head, int ele) {
        Node1 temp = head;
        while (temp.next!=null){

            temp = temp.next;
        }
        Node1 newNode = new Node1(ele);
        temp.next = newNode;
        return head;
    }

    private static Node1 insertAtHead(Node1 head, int ele) {
        if (head == null){
            return new Node1(ele);
        }
        Node1 newNode = new Node1(ele);
        newNode.next = head;
        head = newNode;
        return head;
    }

    private static Node1 deleteMiddle(Node1 head, int k) {
        if (head == null) return null;
        if (k == 1){
            return head.next;
        }
//        int cnt = 1;
//        Node1 temp = head;
//        Node1 prev = null;
//        while (temp!=null){
//            if (cnt == k){
//                prev.next = temp.next;
//                break;
//
//            }
//            prev = temp;
//            temp = temp.next;
//            cnt++;
//        }
        int cnt = 0;
        Node1 temp = head;
        Node1 prev = null;
        while (temp!=null){
            cnt++;
            if (cnt == k){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node1 deleteLast(Node1 head) {
        Node1 temp = head;

        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node arrayToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node move = head;
        for (int i = 1; i < arr.length ; i++) {
            Node temp = new Node(arr[i]);
            move.next = temp;
            move = move.next;
        }
        return head;

    }
    private static boolean searchEle(Node head,int ele) {
        Node temp = head;
        while (temp!=null){
            if (temp.data == ele){
                return true;
            }
            temp = temp.next;
        }
        return false;

    }
    public static void traverse(Node1 head){
        System.out.println("The ll is :-");
        Node1 temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static int lengthLL(Node1 head){
        int cnt = 0;
        Node1 temp = head;
        while (temp!=null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
    public static Node1 deleteHead(Node1 head){
         if (head == null) return null;
         return head.next;
    }


}
