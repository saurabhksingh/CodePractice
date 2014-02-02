package com.dev.saurabh;

import static com.dev.saurabh.BinaryTree.*;

/**
 * Created by ssaurab on 2/2/14.
 */
public class BTCheckHeightBalanced {

    public static void main(String [] args){

        Node root = BinaryTree.createRandomBinaryTree();

        System.out.println("Tree is balanced ? "+isTreeBalanced(root));
    }

    private static boolean isTreeBalanced(Node node) {
        if(node == null){
            return true;
        }

        int lHeight = getHeight(node.lChild);
        int rHeight = getHeight(node.rChild);

        return Math.abs((lHeight-rHeight))<=1 && isTreeBalanced(node.lChild) && isTreeBalanced(node.rChild);
    }

    private static int getHeight(Node node) {
        if(node == null){
            return 0;
        }
        return 1 + Math.max(getHeight(node.lChild), getHeight(node.rChild));
    }

}
