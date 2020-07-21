package com.company.linkedlist;

/*
Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but
the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
that node.
2.3
EXAMPLE
lnput:the node c from the linked list a->b->c->d->e->f
Result: nothing is returned, but the new linked list looks like a ->b->d- >e- >f


Answer : we will depend on two pointers one slow and other fast
slow move one node, fast move two once fast is null the slow is the middle
 */

public class DeleteMiddle {

    public void delete(LinkedList linkedList) {
        Node firstNode = linkedList.getRoot();
        Node doubleNode = firstNode.next;

        if(doubleNode ==null){
            linkedList.setRoot(null);
            return;
        }

        while (firstNode != null) {

            if (doubleNode == null || doubleNode.next == null || doubleNode.next.next == null) {
                firstNode.next=firstNode.next.next;
                break;
            }

            firstNode = firstNode.next;
            doubleNode = doubleNode.next.next;
        }
    }


    public static void main(String str[]) {
        LinkedList link = new LinkedList();
        link.insert(1);
        link.insert(2);
        link.insert(3);
        link.insert(4);
        link.insert(5);

        DeleteMiddle kth = new DeleteMiddle();
        kth.delete(link);
        link.print();
    }


}

