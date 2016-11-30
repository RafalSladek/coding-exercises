package com.rafalsladek.Trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class Tree<T> {

    public TreeNode<T> root;

    public boolean depthFirstSearch(TreeNode<T> root, TreeNode<T> target) {
        if (root == null) return false;
        if (root == target) return true;
        root.mVisited = true;
        for (TreeNode<T> node : root.mChildren) {
            if (node.mVisited == false) {
                if (depthFirstSearch(node, target)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean breadthFirstSearch(TreeNode<T> root, TreeNode<T> target) {
        if (root == null) return false;
        if (root == target) return true;
        root.mVisited = true;
        Queue<TreeNode<T>> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode<T> node = queue.remove();
            if (node == target) {
                return true;
            }
            node.mVisited = true;
            for (TreeNode<T> adjacent : node.mChildren) {
                if (adjacent.mVisited == false) {
                    if (adjacent == target) {
                        return true;
                    }
                    adjacent.mVisited = true;
                    queue.add(adjacent);
                }
            }

        }
        return false;
    }
}
