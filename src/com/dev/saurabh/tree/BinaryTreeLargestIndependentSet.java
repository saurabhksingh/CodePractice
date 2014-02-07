package com.dev.saurabh.tree;

import static com.dev.saurabh.tree.BinaryTree.*;

/**
 * Created by ssaurab on 2/6/14.
 */

/**
 *              10
 *             /  \
 *            20  30
 *           / \    \
 *          40  50  60
 *              / \
 *             70  80
 *
 *             Answer: 10,60,40,70,80 ---> LIS is 5
 */
public class BinaryTreeLargestIndependentSet {

    public static void main(String [] args){
        Node root = BinaryTree.createRandomBinaryTree();
        System.out.println("LISS is : "+getLISS(root));
    }

    private static int getLISS(Node root) {
        if(root == null) return 0;
    
        if(root.liss > -1) return root.liss;

        int includingCurrentNode = 1;
        int excludingCurrentNode = getLISS(root.lChild) + getLISS(root.rChild);

        if(root.lChild != null){
            includingCurrentNode += getLISS(root.lChild.lChild) + getLISS(root.lChild.rChild);
        }
        if(root.rChild != null){
            includingCurrentNode += getLISS(root.rChild.lChild) + getLISS(root.rChild.rChild);
        }

        root.liss = Math.max(includingCurrentNode, excludingCurrentNode);

        return root.liss;
    }
}
