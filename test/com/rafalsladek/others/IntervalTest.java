package com.rafalsladek.others;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntervalTest {
    @Test
    public void hasIntersectionWith() throws Exception {
        Interval a = new Interval(0.7, 4.2);
        Interval b = new Interval(2.7, 3.0);
        assertTrue(a.hasIntersectionWith(b));
    }

    @Test
    public void hasNotIntersectionWith() throws Exception {
        Interval a = new Interval(0.7, 4.2);
        Interval b = new Interval(4.3, 7.0);
        assertFalse(a.hasIntersectionWith(b));
    }

    @Test
    public void hasIntersectionAtBegin() throws Exception {
        Interval a = new Interval(0.7, 4.2);
        Interval b = new Interval(4.2, 7.0);
        assertTrue(a.hasIntersectionWith(b));
    }
}