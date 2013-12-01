package com.example;

/**
 * @author Vladislav Lubenskiy
 */
public class SolutionImpl implements Solution {
    private float x1, x2;

    @Override
    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    @Override
    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }
}
