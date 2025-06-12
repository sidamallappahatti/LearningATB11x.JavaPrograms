package ex_30_Exceptions;

public class Lab222_Try_Catch_Multiple {
    public static void main(String[] args) {
        System.out.println("Start");

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot be divide by zero");
        } catch (Exception e) {
            System.out.println("Any number can't be divide by zero");
        }
        System.out.println("Stop");
    }
}
