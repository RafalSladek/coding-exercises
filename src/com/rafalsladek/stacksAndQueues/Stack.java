package com.rafalsladek.stacksAndQueues;

public class Stack<T> {

    public static class StackNode<T> {
        T data;
        StackNode next;

        public StackNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public StackNode<T> top;

    public T pop() {
        if (isEmpty()) throw new NullPointerException("Stack is empty");
        T data = top.data;
        top = top.next;
        return data;
    }

    public void push(T data) {
        StackNode<T> current = new StackNode<T>(data);
        current.next = top;
        top = current;
    }

    public T peek() {
        if (isEmpty()) throw new NullPointerException("Stack is empty");
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
