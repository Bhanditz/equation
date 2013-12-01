package com.example;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testIntegration() {
        Equation equation = new EquationImpl("1", "-2", "-3");
        try {
            Solution solution = equation.solve();
            Assert.assertTrue(solution.getX1() == 3);
            Assert.assertTrue(solution.getX2() == -1);
        } catch (SolvingException e) {
            // We don't have a solution or have infinite number of them
            e.printStackTrace();
        }
    }
}
