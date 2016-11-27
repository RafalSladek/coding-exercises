package com.rafalsladek.stacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    @Test
    public void unbalancedExpression() throws Exception {
        String expression = "([][])([]{})({}{)";
        boolean actually = BalancedBrackets.solution(expression);
        boolean expected = false;
        assertEquals(expected, actually);
    }

    @Test
    public void balancedExpression() throws Exception {
        String expression = "{([][])([]{})({}{})}";
        boolean actually = BalancedBrackets.solution(expression);
        boolean expected = true;
        assertEquals(expected, actually);
    }

}