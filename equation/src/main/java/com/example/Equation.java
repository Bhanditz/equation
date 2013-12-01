package com.example;

/**
 * @author Vladislav Lubenskiy
 */
public interface Equation {
    Solution solve() throws SolvingException;
}
