package com.dev.saurabh.com.dev.saurabh.tree;

/**
 * Created by ssaurab on 2/2/14.
 */
public class BinaryTree {

    public static class Node{

        public Node lChild;
        public Node rChild;
        public int data;
    }

    public static Node createRandomBinaryTree(){
        int data = (int)(Math.random() * (100 + 1));
        Node root = new Node();
        root.data = data;

        populateTree(root, 0);

        return root;
    }

    private static void populateTree(Node root, int count) {

        if(count > 8){
            return;
        }

        Node leftChild = new Node();
        leftChild.data = (int)(Math.random() * (100 + 1));

        Node rightChild = new Node();
        rightChild.data = (int)(Math.random() * (100 + 1));

        root.lChild = leftChild;
        root.rChild = rightChild;

        populateTree(leftChild, count+1);
        populateTree(rightChild, count+1);
    }
}
