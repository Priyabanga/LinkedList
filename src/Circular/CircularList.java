package Circular;

public class CircularList {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    int size=0;
    Node head=null;
    Node tail=null;


    public static void main(String[] args) {
        CircularList list=new CircularList();
        System.out.println(list);
    }
    @Override
    public String toString{
        StringBuilder response = new StringBuilder();
        return response;
    }
}
