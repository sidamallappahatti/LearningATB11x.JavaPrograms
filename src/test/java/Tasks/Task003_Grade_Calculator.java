package Tasks;

import java.util.Scanner;

public class Task003_Grade_Calculator {
    public static void main(String[] args) {
//        A: 90-100;    B: 80-89;  C: 70-79;    D: 60-69;   F: 0-59

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score");
        int score = sc.nextInt();

//        String grade=score<=59? "F":(score<=69)?"D":(score<=79)?"C":(score<=89)?"B":(score<=100)?"A":"Invalid score";

        String grade1 = (score < 0 || score > 100) ? "Invalid score" : (score <= 59) ? "F" : (score <= 69) ? "D" : (score <= 79) ? "C" : (score <= 89) ? "B" : "A";
        System.out.println("For score:" + score + " ,Grade is " + grade1);

    }
}
