package org.dsa.list;


public class SinglyLInkedList {
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);
        System.out.print("Singly Linked List:");
        printList(head);
    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(" " + head.data);
            head = head.next;
        }
        System.out.println();
    }
}
