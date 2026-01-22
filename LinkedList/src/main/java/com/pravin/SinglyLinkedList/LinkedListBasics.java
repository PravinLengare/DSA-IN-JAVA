package com.pravin.SinglyLinkedList;

import java.util.Scanner;

public class LinkedListBasics {

    // Convert Array to Linked List
    public static Node convertToLL(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // Traverse Linked List
    public static void traverse(Node head) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Length of Linked List
    public static int lengthOfLL(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Search Element
    public static boolean checkAElement(Node head, int num) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == num) return true;
            temp = temp.next;
        }
        return false;
    }

    // Delete Head
    public static Node deleteAHead(Node head) {
        if (head == null) return null;
        return head.next;
    }

    // Delete Tail
    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) return null;

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // Delete at Kth Position
    public static Node deleteAtKth(Node head, int k) {
        if (head == null) return null;

        if (k == 1) return deleteAHead(head);

        Node temp = head;
        Node prev = null;
        int cnt = 1;

        while (temp != null && cnt < k) {
            prev = temp;
            temp = temp.next;
            cnt++;
        }

        if (temp == null) return head; // invalid position

        prev.next = temp.next;
        return head;
    }

    // Insert at Kth Position
    public static Node insertIntoLL(Node head, int ele, int k) {

        if (k == 1) {
            return new Node(ele, head);
        }

        Node temp = head;
        int cnt = 1;

        while (temp != null && cnt < k - 1) {
            temp = temp.next;
            cnt++;
        }

        if (temp == null) return head; // invalid position

        Node newNode = new Node(ele);
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    // MAIN METHOD
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 3, 2, 1};
        Node head = null;
        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== LINKED LIST MENU =====");
            System.out.println("1. Convert array to linked list");
            System.out.println("2. Traverse linked list");
            System.out.println("3. Length of linked list");
            System.out.println("4. Search element");
            System.out.println("5. Delete head");
            System.out.println("6. Delete tail");
            System.out.println("7. Delete at position");
            System.out.println("8. Insert at position");
            System.out.println("9. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    head = convertToLL(arr);
                    System.out.println("Linked list created");
                    break;

                case 2:
                    traverse(head);
                    break;

                case 3:
                    System.out.println("Length: " + lengthOfLL(head));
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    int search = sc.nextInt();
                    System.out.println(checkAElement(head, search));
                    break;

                case 5:
                    head = deleteAHead(head);
                    traverse(head);
                    break;

                case 6:
                    head = deleteTail(head);
                    traverse(head);
                    break;

                case 7:
                    System.out.print("Enter position to delete: ");
                    int delPos = sc.nextInt();
                    head = deleteAtKth(head, delPos);
                    traverse(head);
                    break;

                case 8:
                    System.out.print("Enter element: ");
                    int ele = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    head = insertIntoLL(head, ele, pos);
                    traverse(head);
                    break;

                case 9:
                    exit = true;
                    System.out.println("Exiting...");
                    Thread.sleep(1000);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
