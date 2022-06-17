package com.bli.jessica_assignment.assignment3;

public class Calculation implements A, B {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public long mul(int x, int y) {
        return x * y;
    }
}
