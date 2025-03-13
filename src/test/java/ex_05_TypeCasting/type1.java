package ex_05_TypeCasting;

import java.util.Scanner;

public class type1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Score Value: ");
        int Score = scanner.nextInt();

        String grade = (Score >= 90) ? "A" : (Score >= 80) ? "B" : (Score >= 70) ? "C" : (Score >= 60) ? "D" : "F";

        System.out.println(grade);
        }
    }


