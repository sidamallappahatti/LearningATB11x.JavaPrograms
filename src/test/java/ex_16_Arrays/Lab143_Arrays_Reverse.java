package ex_16_Arrays;

import java.util.Scanner;

public class Lab143_Arrays_Reverse {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

    }
}