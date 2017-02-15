package com.rafalsladek.others;

public class RainDropNode implements Comparable {

    Interval data;
    RainDropNode next;

    public RainDropNode(Interval interval) {
        this.data = interval;
    }

    public boolean hasIntersactionWithNext() {
        if (next == null) {
            return false;
        }
        return data.hasIntersectionWith(next.data);
    }

    public boolean isAlone() {
        return !hasIntersactionWithNext();
    }

    @Override
    public int compareTo(Object o) {
        RainDropNode that = (RainDropNode) o;
        return this.data.compareTo(that.data.start);
    }

    @Override
    public String toString(){
        return data.toString();
    }
}
