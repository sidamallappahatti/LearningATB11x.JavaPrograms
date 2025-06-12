package ex_30_Exceptions;

public class Lab230_Interview_Question {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;
        try {
            int x = 10 / a;
        } catch (Exception e) {
            System.out.println("Can't divide by zero");
        } finally {
            System.out.println("I will be executed anyhow!");
        }
    }
}
