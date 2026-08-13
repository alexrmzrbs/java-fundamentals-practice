import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        // Create an instance of the Random & Scanner classes
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100 (inclusive)
        int targetNumber = random.nextInt(100) + 1;

        System.out.println("Welcome to the Number Guessing Game!");

        // Loop until the user guesses the correct number
        while (true) {
            System.out.print("Enter your guess (1-100): ");
            int userGuess = scanner.nextInt();

            // Check if the user's guess is correct
            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You've guessed the correct number: " + targetNumber);
                break; // Exit the loop if the guess is correct
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

}