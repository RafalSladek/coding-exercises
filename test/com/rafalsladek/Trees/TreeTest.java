package com.rafalsladek.Trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {
    @Test
    public void depthFirstSearch() throws Exception {

        Tree<Integer> tree = new Tree<>();
        TreeNode<Integer> root = new TreeNode<>(5);
        TreeNode<Integer> child1 = new TreeNode<>(3);
        TreeNode<Integer> child2 = new TreeNode<>(6);
        TreeNode<Integer> child3 = new TreeNode<>(7);
        TreeNode<Integer> child4 = new TreeNode<>(8);
        TreeNode<Integer> child5 = new TreeNode<>(4);

        root.mChildren.add(child5);
        root.mChildren.add(child3);
        child5.mChildren.add(child1);
        child3.mChildren.add(child4);
        child3.mChildren.add(child2);

        assertTrue(tree.depthFirstSearch(root, child2));
    }

    @Test
    public void breadthFirstSearch() throws Exception {

        Tree<Integer> tree = new Tree<>();
        TreeNode<Integer> root = new TreeNode<>(5);
        TreeNode<Integer> child1 = new TreeNode<>(3);
        TreeNode<Integer> child2 = new TreeNode<>(6);
        TreeNode<Integer> child3 = new TreeNode<>(7);
        TreeNode<Integer> child4 = new TreeNode<>(8);
        TreeNode<Integer> child5 = new TreeNode<>(4);

        root.mChildren.add(child5);
        root.mChildren.add(child3);
        child5.mChildren.add(child1);
        child3.mChildren.add(child4);
        child3.mChildren.add(child2);

        assertTrue(tree.breadthFirstSearch(root, child2));
    }

}