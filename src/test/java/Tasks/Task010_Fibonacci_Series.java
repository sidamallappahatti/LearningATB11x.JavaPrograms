package Tasks;

import java.util.Scanner;

public class Task010_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for Fibonacci series");
        int num = sc.nextInt();


        if (num <= 0) {
            System.out.println("Please enter number greater than 0");
        } else {
            int f1 = 0;
            int f2 = 1;

            System.out.print("Fibonacci Series: " + f1);
            if (num > 1) {

                System.out.print(" " + f2);
            }

            for (int i = 2; i < num; i++) {
                int next = f1 + f2;
                System.out.print(" " + next);
                f1 = f2;
                f2 = next;

            }

        }
        sc.close();
    }
}
