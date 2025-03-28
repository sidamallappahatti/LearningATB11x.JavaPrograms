package ex_16_Arrays;

import java.util.Arrays;

public class Lab145_Interview_2nd_Highest_Number {
    public static void main(String[] args) {

        int[] numbers = {10, 2, 3, 4, 5, 6};

        Arrays.sort(numbers);

        System.out.println("2nd Highest number: " + numbers[numbers.length - 2]);
        System.out.println("2nd Lowest number: " + numbers[1]);
    }
}