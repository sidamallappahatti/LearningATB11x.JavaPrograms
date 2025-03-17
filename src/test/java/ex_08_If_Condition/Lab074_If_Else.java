package ex_08_If_Condition;

import java.util.Scanner;

public class Lab074_If_Else {
    public static void main(String[] args) {
        // How to take the user Input
        // 1. CLI Options
        //
//        int age = Integer.parseInt(args[0]);

        // 2. Scanner Class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age!");
        int age = scanner.nextInt();
        System.out.println(age);


        if (age > 18) {
            System.out.println("Allowed to vote!");
        } else {
            System.out.println("Not Allowed!");
        }

    }
}
