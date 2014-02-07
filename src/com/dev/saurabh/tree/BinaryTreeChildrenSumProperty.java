package com.dev.saurabh.tree;

import static com.dev.saurabh.tree.BinaryTree.*;
/**
 * Created by ssaurab on 2/2/14.
 */
public class BinaryTreeChildrenSumProperty {

    public static void main(String [] args){

        Node root = BinaryTree.createRandomBinaryTree();

        System.out.println(verify(root));
    }

    private static boolean verify(Node root) {
        if(root == null || (root.lChild == null && root.rChild == null)){
            return true;
        }

        int leftData = root.lChild == null ? 0 : root.lChild.data;
        int rightData = root.rChild == null ? 0 : root.rChild.data;

        return (root.data == leftData + rightData) && verify(root.lChild) && verify(root.rChild);
    }
}
