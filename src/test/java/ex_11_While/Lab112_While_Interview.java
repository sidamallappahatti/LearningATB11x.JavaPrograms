package ex_11_While;

import java.util.Scanner;

public class Lab112_While_Interview {
    public static void main(String[] args) {

        //Factorial
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get factorial");
        int number = sc.nextInt();

        int factorial = 1;
        if (number <= 0) {
            System.out.println(factorial);
        } else {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
        sc.close();
    }
}