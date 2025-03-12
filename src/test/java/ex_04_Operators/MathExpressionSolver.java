package ex_04_Operators;

import static java.lang.Math.cbrt;

public class MathExpressionSolver {
    public static void main(String[] args) {

        int x=10;
        int y=10;
        int z=10;

        double result=cbrt(Math.pow(x, 2)+Math.pow(y, 2)-Math.abs(z));
        System.out.println(result);

//        OR

       /* double squareOfX = Math.pow(x, 2);
        double squareOfY = Math.pow(y, 2);
        int absValue = Math.abs(z);

        System.out.println(cbrt(squareOfX+squareOfY-absValue));
*/
    }
}
