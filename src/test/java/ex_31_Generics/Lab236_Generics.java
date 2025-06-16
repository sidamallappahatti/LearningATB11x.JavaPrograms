package ex_31_Generics;

public class Lab236_Generics {
    public static void main(String[] args) {
        temp_sum(4, 5);
        temp_sum(3.25, 1.25);
        temp_sum("Siddu", "Hatti");

    }

    static int temp_sum(int a, int b) {
        return a + b;
    }

    static double temp_sum(double a, double b) {
        return a + b;
    }

    static String temp_sum(String a, String b) {
        return a + b;
    }
}

