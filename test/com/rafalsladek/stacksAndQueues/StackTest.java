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

    }

    @Test
    public void peek() throws Exception {

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