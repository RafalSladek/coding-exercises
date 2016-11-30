package com.rafalsladek.Trees;

import java.util.ArrayList;

public class TreeNode<T> {

    public T mData;
    public boolean mVisited;
    public ArrayList<TreeNode<T>> mChildren;

    public TreeNode(T data) {
        mData = data;
        mChildren = new ArrayList<>();
        mVisited = false;
    }

    @Override
    public String toString() {
        return mData.toString();
    }
}
