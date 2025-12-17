package SinglyLL;

public class Reverse_Linked_List {
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void display(Node head){
        if (head == null) return;
        System.out.print(head.data+"-> ");
        display(head.next);


    }
    public static Node reverse(Node head){
        if (head.next == null) return head;
        Node newHead  = reverse(head.next);
        head.next.next =  head;
        head.next  = null;

        return newHead;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
        Node r = reverse(a);
        System.out.println();
        display(r);

    }
}
