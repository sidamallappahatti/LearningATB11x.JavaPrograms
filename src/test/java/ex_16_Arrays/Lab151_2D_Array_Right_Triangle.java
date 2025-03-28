package ex_16_Arrays;

import java.util.Scanner;

public class Lab151_2D_Array_Right_Triangle {
    public static void main(String[] args) {

        //*
        //**
        //***
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows you want in triangle");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");

            }
            System.out.print("\n");

        }
    }
}
