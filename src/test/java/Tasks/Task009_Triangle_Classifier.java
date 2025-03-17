package Tasks;

import java.util.Scanner;

public class Task009_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of triangle");
        double side_A = sc.nextDouble();
        double side_B = sc.nextDouble();
        double side_C = sc.nextDouble();

        if (side_A + side_B > side_C && side_A + side_C > side_B && side_B + side_C > side_A) {
            if (side_A == side_B && side_B == side_C) {
                System.out.println("equilateral");
            } else if (side_A == side_B || side_A == side_C || side_B == side_C) {
                System.out.println("isosceles");

            } else {
                System.out.println("scalene");
            }
        } else {
            System.out.println("Invalid triangle");
        }
        sc.close();
    }
}