package com.company.linkedlist;

/*
Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
before all nodes greater than or equal to x. If x is contained within the list the values of x only need
to be after the elements less than x (see below). The partition element x can appear anywhere in the
"right partition"; it does not need to appear between the left and right partitions.
EXAMPLE
Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition= 5]
Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8

Answer will divide left and right partition
left is less than partition and will iterate on all items to assignee it to left or right

 */

public class Partition {

    public void delete(LinkedList linkedList, int num) {
        Node currentNode = linkedList.getRoot();
        Node prev = null, leftNode = null;
        Node temp;
        while (currentNode != null) {

            if(currentNode.data == num && leftNode == null ){
                leftNode = prev;
                prev = currentNode;
                currentNode = currentNode.next;
            }
            else if(currentNode.data < num && leftNode !=null){

                temp = currentNode;
                currentNode = currentNode.next;
                prev.next = currentNode;
                temp.next = leftNode.next;
                leftNode.next = temp;
            }
            else{
                prev = currentNode;
                currentNode = currentNode.next;     
            }
        }
    }


    public static void main(String str[]) {
        LinkedList link = new LinkedList();
        link.insert(1);
        link.insert(2);
        link.insert(3);
        link.insert(4);
        link.insert(5);
        link.insert(1);
        link.insert(2);

        Partition kth = new Partition();
        kth.delete(link,5);
        link.print();

        System.out.println("------------------------------------------");
        LinkedList link2 = new LinkedList();

        link2.insert(3);
        link2.insert(5);
        link2.insert(8);
        link2.insert(5);
        link2.insert(10);
        link2.insert(2);
        link2.insert(1);

        Partition kth2 = new Partition();
        kth2.delete(link2,5);
        link2.print();
    }


}

