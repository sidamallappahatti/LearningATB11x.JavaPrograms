package ex_16_Arrays;

import java.util.Scanner;

public class Lab152_2D_Multiplication_Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of multiplication table");
        int Size_of_the_Table = sc.nextInt();

        for (int i = 0; i < Size_of_the_Table; i++) {
            for (int j = 0; j < Size_of_the_Table; j++) {
                System.out.print(i * j + " ");

            }
            System.out.print("\n");
        }
    }
}

