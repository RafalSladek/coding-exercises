package com.rafalsladek.Trees;

import static java.lang.System.out;

public class BinaryTree<T> {

    public BinaryTreeNode<T> root;

    public void inOrderTraversal(BinaryTreeNode node) {
        if (node != null) {
            inOrderTraversal(node.mLeft);
            out.println(node.mData);
            inOrderTraversal(node.mRight);
        }
    }


    public void preOrderTraversal(BinaryTreeNode node) {
        if (node != null) {
            out.println(node.mData);
            preOrderTraversal(node.mLeft);
            preOrderTraversal(node.mRight);
        }
    }

    public void postOrderTraversal(BinaryTreeNode node) {
        if (node != null) {
            postOrderTraversal(node.mLeft);
            postOrderTraversal(node.mRight);
            out.println(node.mData);
        }
    }

}
