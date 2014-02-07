package com.dev.saurabh.tree;

import static com.dev.saurabh.tree.BinaryTree.*;

/**
 * Created by ssaurab on 2/6/14.
 */
public class BinaryTreeKDistanceNodes {

    public static void main(String [] args){
        Node root = BinaryTree.createRandomBinaryTree();
        printNodesAtKDistance(root, 3);
    }

    private static void printNodesAtKDistance(Node root, int k) {
        if(root == null) return;

        if(k == 0) System.out.println(root.data);

        printNodesAtKDistance(root.lChild, k-1);
        printNodesAtKDistance(root.rChild, k-1);
    }
}
