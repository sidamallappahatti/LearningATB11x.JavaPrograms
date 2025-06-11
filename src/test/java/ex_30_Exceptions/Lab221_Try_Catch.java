package ex_30_Exceptions;

public class Lab221_Try_Catch {
    public static void main(String[] args) {

        System.out.println("1");

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Number can't be divide by 0");
        }
        System.out.println(2);
    }
}
