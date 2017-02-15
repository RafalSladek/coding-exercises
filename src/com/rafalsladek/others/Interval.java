package com.rafalsladek.others;

public class Interval implements Comparable {
    double start;
    double end;

    public Interval(double start, double end) {
        this.start = start;
        this.end = end;
    }

    public boolean hasIntersectionWith(Interval that) {
        if (this.start > that.end || this.end < that.start) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        Interval that = (Interval) o;
        if (this.start < that.start) return -1;
        if (this.start > that.start) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "(" + start + "," + end + ") ";
    }
}