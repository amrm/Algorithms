package com.company.linkedlist;

/*

Find the n’th Node from the end of a given Linked List
Objective: Given a linked list and integer ‘n’, write an algorithm to find the nth node from the end in the Linked List.

Example:

Original List : ->1->2->8->3->7->0->4
Output : 3rd Element from the end is : 7

Answer using recursion
last item is index 0
second last index 1
third last index =2
...

 */

public class Kth {

    public void find(LinkedList linkedList, int k) {
        Node firstNode = linkedList.getRoot();
        printKth(firstNode,k);
    }

    public int printKth(Node node, int k){

        if(node == null){
            return 0;
        }
        else {
           int cur = printKth(node.next, k ) + 1;
           if(cur == k){
               System.out.println("Data  : " + node.data);
           }
           return cur;
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

        Kth kth = new Kth();
        kth.find(link,6);
    }


}

