package ex_16_Arrays;

import java.util.Scanner;

public class Lab153_2D_Array_Left_Triangle {
    public static void main(String[] args) {

        //***
        //**
        //*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows you want in triangle");
        int row = sc.nextInt();

        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }

            System.out.print("\n");

        }
    }
}
