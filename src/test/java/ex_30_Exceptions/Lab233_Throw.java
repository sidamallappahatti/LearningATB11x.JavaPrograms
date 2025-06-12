package ex_30_Exceptions;

public class Lab233_Throw {
    public static void main(String[] args) {

    }

    static void divideBYZero(int a) {

        if (a == 0) {
            throw new ArithmeticException();
        }
    }
}
