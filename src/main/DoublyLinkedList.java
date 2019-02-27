package main;

public class DoublyLinkedList {
    private static class Node {
        private int data;
        private Node prev, next;

        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
        private int size = 0;
        private Node head = null;
        private Node tail = null;

        public static void main(String[] args) {
            DoublyLinkedList linkedList = new DoublyLinkedList();
            System.out.println(linkedList);     //prints reference so we create toString method
            for (int i = 0; i < 5; i++) {
                linkedList.insertHead(i+1);
            }
            System.out.println(linkedList);
        }


        @Override
        public String toString() {
            StringBuilder response = new StringBuilder();
            response.append("[");
            Node temp = this.head;
            while(temp!=null)
            {
                response.append(temp.data);
                if(temp.next!=null){
                    response.append(" <==> ");
                }
                temp=temp.next;

            }
            response.append("]");
            return response.toString();
        }
        public void insertHead(int data){
            Node newNode = new Node(data,null,this.head);
            this.head=newNode;
            size++;
        }
    }


