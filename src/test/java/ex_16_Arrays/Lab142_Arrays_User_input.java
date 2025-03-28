package ex_16_Arrays;

import java.util.Scanner;

public class Lab142_Arrays_User_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        String[] marks = new String[size];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the numbers");
            marks[i] = sc.next();
        }

        System.out.println("-------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        sc.close();
    }
}