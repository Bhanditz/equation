package com.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Equation equation = new EquationImpl("1", "-2", "-3");
        try {
            Solution solution = equation.solve();
            System.out.println(solution.getX1());
            System.out.println(solution.getX2());
        } catch (SolvingException e) {
            System.out.println(e.getMessage());
        }
    }
}
