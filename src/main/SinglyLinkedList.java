package main;



public class SinglyLinkedList {
    private class Node{
        private int data;
        private Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }

        public Node(Node next) {
            this.next = next;
        }
    }
    private Node head = null;
     private int size = 0;

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        System.out.println(linkedList);
        /*for (int i = 0; i < 5; i++) {
            linkedList.insertHead(i+1);
        }*/
        linkedList.insertHead(42);
        linkedList.insertHead(66);
        System.out.println(linkedList);

    }
    @Override
    public String toString(){
        StringBuilder response = new StringBuilder();
        response.append("[");
        Node temp = this.head;                  //as during traversal head changes so we make a copy of it
        while(temp!=null)
        {
            response.append(temp.getData());
            if(temp.next!=null)
            {
                response.append(" ==> ");
            }
            temp=temp.next;
        }
        response.append("]");
        return response.toString();
    }
    private void insertHead(int data)           //if list is empty so bottom is head in list
    {
        Node newNode = new Node(data,this.head);
        this.head = newNode;
        size++;
    }
    private void insertAfter(int data,Node node)        //if list is not empty
    {
        Node newNode= new Node(data,node.next);
        node.next = newNode;
        size++;
    }
    public void insert(int data)
    {
        if(head==null)
            insertHead(data);
        else
        {
            Node temp=this.head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            insertAfter(data,temp);
        }
    }
    private int removeHead()
    {
        int response= -1;
        Node temp = this.head;
        if(temp!=null)
        {
            this.size--;
            response=temp.data;
            this.head=this.head.next;
        }
        return response;
    }
    public int removeAfter(Node node) {
        int response = -1;
        Node temp=node.next;
        if (temp != null) {
            temp= node.next;
            response = temp.data;
            node.next = temp.next;
            size--;
        }
        return response;
    }

}
