package com.dev.saurabh;

import static com.dev.saurabh.BinaryTree.*;


/**
 * Created by ssaurab on 2/2/14.
 */
public class BinaryTreePathHasSum {

    public static void main(String [] args){

        Node root = BinaryTree.createRandomBinaryTree();

        for(int i =2; i<1000; i++){
            if(hasPathSum(root, i)){
                System.out.println("Tree has path for sum : "+i);
            }
        }
    }

    private static boolean hasPathSum(Node node, int sum) {
        if(node == null){
            return sum == 0;
        }

        int subSum = sum - node.data;

        if(subSum == 0 && node.lChild == null && node.rChild == null){
            return true;
        }

        if(node.lChild != null){
            return hasPathSum(node.lChild, subSum);
        }
        if(node.rChild != null){
            return hasPathSum(node.rChild, subSum);
        }

        return false;
    }
}
