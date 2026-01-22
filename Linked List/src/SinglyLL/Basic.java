package SinglyLL;

public class Basic {
    public static class Node {
        int data;
        Node next;

        Node (int data){
            this.data = data;
        }
    }
    public static void printLL(Node head){   // If we print using the head by head = head.next then we will lose our head so we create a var and then by using it we print the whole linked list.
        System.out.println("Printing by using function !");
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void recursivePrint(Node head){

        if(head == null){
            return;
        }
        System.out.println(head.data);
        recursivePrint(head.next);

    }
    public static void rvPrint(Node head){
        Node temp = head;
        if (temp == null){
            return;
        }
        rvPrint(temp.next);
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(2);

        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println("We are doing printing in manually !");
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);

        printLL(a);
        System.out.println();
        System.out.println("Using recursion !");
        recursivePrint(a);
        System.out.println("Using recursion Reverse ll !");
        rvPrint(a);



    }
}
