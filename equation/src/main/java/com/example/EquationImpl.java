package com.example;


/**
 * Hello world!
 */
public class EquationImpl implements Equation {
    private int a, b, c;

    public EquationImpl(String a, String b, String c) {
       this.a = Integer.valueOf(a);
       this.b = Integer.valueOf(b);
       this.c = Integer.valueOf(c);
    }

    @Override
    public Solution solve() throws SolvingException {
        if (a != 0) {
            int desc = b * b - 4 * a * c;
            if (desc < 0) {
                throw new SolvingException("There is no solution");
            } else {
                SolutionImpl solution = new SolutionImpl();
                solution.setX1((float) ((-b + Math.sqrt(desc)) / 2*a));
                solution.setX2((float) ((-b - Math.sqrt(desc)) / 2*a));
                return solution;
            }
        } else if (b != 0) {
            SolutionImpl solution = new SolutionImpl();
            solution.setX1((float) -c / b);
            solution.setX2((float) -c / b);
            return solution;

        } else if (c == 0) {
            throw new SolvingException("There is infinite set of solution");
        } else {
            throw new SolvingException("There is no solution");
        }
    }

}
