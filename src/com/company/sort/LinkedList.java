package com.company.sort;

public class LinkedList {

    private Node root;
    private Node last;

    LinkedList() {
        root = null;
    }

    public void insert(Object data) {
        if (root == null) {
            root = new Node(data, null);
            last = root;
        } else {
            last=last.next=new Node(data,null);

          /*  Node link = root;

            while (link.next != null) {
                link = link.next;
            }
            link.next = new Node(data, null);*/
        }
    }

    public void remove(Object data) {
        if (root != null) {
            if (root.data == data) {
                root = root.next;
            } else {
                Node link = root;
                Node previous = link;
                while (link != null) {
                    if (link.data == data) {
                        previous.next = link.next;
                        break;
                    }
                    previous = link;
                    link = link.next;
                }
            }
        }
    }

    public void print() {
        if (root != null) {
            Node link = root;
            while (link != null) {
                System.out.print(link.data + " ");
                link = link.next;
            }
            System.out.println();
        }
    }

    public static void main(String... str) {
        LinkedList linkedList = new LinkedList();
        linkedList.remove(10);
        linkedList.print();

        linkedList.insert(10);
        linkedList.insert(11);
        linkedList.insert(12);
        linkedList.insert(13);
        linkedList.print();
        linkedList.remove(10);
        linkedList.print();
        linkedList.remove(12);
        linkedList.print();
    }

    class Node {
        Object data;
        Node next;

        Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}

