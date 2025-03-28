package ex_16_Arrays;

public class Lab144_Sum_of_Arrays {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        System.out.println("==== For Each Loop =====");

        int sum1 = 0;
        for (int n : numbers) {
            sum1 += n;
        }
        System.out.println(sum1);

    }
}