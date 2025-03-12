package ex_04_Operators;

import static java.lang.Math.*;

public class MathExpressionSolver {
    public static void main(String[] args) {

        int x=10;
        int y=10;
        int z=10;

        double result = cbrt(pow(x, 2) + pow(y, 2) - abs(z));
        System.out.println(result);

//        OR

        /*
        double squareOfX = pow(x, 2);
        double squareOfY = pow(y, 2);
        int absValue = Math.abs(z);

        System.out.println(cbrt(squareOfX+squareOfY-absValue));*/
    }
}
