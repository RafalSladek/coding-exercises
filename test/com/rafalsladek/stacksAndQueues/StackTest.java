package com.rafalsladek.stacksAndQueues;

import org.junit.Test;
import org.omg.CORBA.Object;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void popOneEleFrom2EleStack() throws Exception {
        Stack<String> stack = new Stack<>();
        stack.push("abc");
        String actually = stack.pop();
        assertTrue(actually.equals("abc"));
    }

    @Test
    public void push() throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        assertTrue(stack.top.data.intValue() == 2);
        stack.push(3);
        assertTrue(stack.top.data.intValue() == 3);
        stack.push(4);
        stack.push(5);
        assertTrue(stack.top.data.intValue() == 5);
    }

    @Test
    public void peek() throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        int actually = stack.peek();
        int expected = 4;
        assertEquals(expected, actually);
    }

    @Test
    public void pop() throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        int actually = stack.pop();
        int expected = 4;
        assertEquals(expected, actually);
        assertTrue(stack.top.data == 3);
    }

    @Test
    public void newStackIsEmpty() throws Exception {
        Stack<Object> stack = new Stack<>();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void OneEleInStackIsNotEmpty() throws Exception {
        Stack<String> stack = new Stack<>();
        stack.push("abc");
        assertFalse(stack.isEmpty());
    }


}