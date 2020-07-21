package com.company.linkedlist;

public class LinkedList {

    private Node root;
    private Node last;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public void insert(int data) {

        if (root == null)
            root = last = new Node(data);
        else
            last = last.next = new Node(data);
    }

    public void print(){
        if(root==null)
            return;
        Node node=root;
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }

    public static void main(String str[]){
        LinkedList link=new LinkedList();
        link.insert(5);
        link.insert(3);
        link.insert(1);
        link.insert(20);
        link.insert(3);
        link.insert(2);
        link.insert(1);
        link.insert(5);
        link.insert(20);
        link.print();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
