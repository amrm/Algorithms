package com.company.linkedlist;

/*

Remove Dups: Write code to remove duplicates from an unsorted linked list.
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?

Answer by iterate on each item with all others
 */

public class RemoveDuplication {

    public void reduce(LinkedList linkedList) {

        Node firstNode = linkedList.getRoot();
        while (firstNode != null) {
            Node secondNode = firstNode;
            while (secondNode.next != null) {
               if(firstNode.data == secondNode.next.data){
                   secondNode.next = secondNode.next.next;
               }else{
                   secondNode =secondNode.next;
               }
            }
            firstNode = firstNode.next;
        }

    }

    public static void main(String str[]) {
        LinkedList link = new LinkedList();
        link.insert(5);
        link.insert(3);
        link.insert(1);
        link.insert(20);
        link.insert(3);
        link.insert(2);
        link.insert(1);
        link.insert(5);
        link.insert(20);

        RemoveDuplication removeDuplication = new RemoveDuplication();
        removeDuplication.reduce(link);
        link.print();
    }


}

