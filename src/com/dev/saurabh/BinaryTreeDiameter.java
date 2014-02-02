package com.dev.saurabh;

import static com.dev.saurabh.BinaryTree.*;
/**
 * Created by ssaurab on 2/2/14.
 */
public class BinaryTreeDiameter {

    public static void main(String [] args){

        Node root  = BinaryTree.createRandomBinaryTree();

        System.out.println(getDiameter(root));
    }

    private static int getDiameter(Node root) {
        if(root == null){
            return 0;
        }

        int lHeight = getHeight(root.lChild);
        int rHeight = getHeight(root.rChild);

        return Math.max(lHeight + 1 + rHeight, Math.max(getDiameter(root.lChild), getDiameter(root.rChild)));
    }

    private static int getHeight(Node node) {
        if(node == null){
            return 0;
        }
        return 1 + Math.max(getHeight(node.lChild), getHeight(node.rChild));
    }
}
