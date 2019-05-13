package 간단한알고리즘_01;

public class LinkedList<T> {

    private Node head;

    public LinkedList(){
        head = null;
    }

    private class Node{
        public T data;
        public Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public boolean add(T e){
        if(head == null){
            head = new Node(e);
        }else{
            Node node = head;
            while(head.next != null){
                node = node.next;
            }
            node.next = new Node(e);
        }
        return true;
    }

    public T get(int index){
        Node node = getNode(index);
        return node.data;
    }

    private Node getNode(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }
}
