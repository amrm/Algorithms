package com.company.tree;

/*
    Minimal Tree: Given a sorted (increasing order) array with unique integer elements, write an
    algorithm to create a binary search tree with minimal height.

    Solution : find middle array and make it root
    then recursive by divide array to two then get middle for each one
    [1,2,3,4,5,6,7]  root is 4
    array1 [1,2,3]  root.left =2  , array2 [4,6,7]  root.right=6
    recursive for rest to end
 */

import javax.transaction.TransactionRequiredException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class MinimalTree {

    TreeNode root = null;

    public void insert(int array[]) {
        root = insert(array, 0, array.length-1);
    }

    private TreeNode insert(int array[], int start, int end) {
        if (end < start) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(array[mid]);
        node.left = insert( array, start, mid - 1);
        node.right = insert( array, mid + 1, end);

        return node;
    }

    public void print() {
        if(root == null)
            return;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        TreeNode current;

        while(!queue.isEmpty()){
            current = queue.poll();
            System.out.println(current.getValue());
            if (current.getRight() != null)
                queue.add(current.getRight());
            if (current.getLeft() != null)
                queue.add(current.getLeft());
        }


    }

    public static void main(String str[]) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        MinimalTree tree = new MinimalTree();
        tree.insert(array);
        tree.print();
    }
}

class TreeNode {

    private int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
    }

    TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}


