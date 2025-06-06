package ex_20_OOPs_Polymorphism.MethodOverLoading;

public class Calculator {
    int attribute;

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(4, 5));

        double d = c.add(6.251, 3.555);
        System.out.println(d);

    }
}
