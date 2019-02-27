package main;

public class DoublyLinkedList {
    private static class Node{
        private int data;
        private Node prev,next;

        public Node(int data,Node prev,Node next)
        {
            this.data=data;
            this.prev=prev;
            this.next=next;
        }
    }
}
