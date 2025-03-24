package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab113_While_Guessing_Game {
    public static void main(String[] args) {
        // Guess a number between 1 and 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 100");

        int guess;
        int attempts = 0;

        while (true) {
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low, Try again!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, Try again!");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts");
                break;
            }
        }
        scanner.close();
    }
}