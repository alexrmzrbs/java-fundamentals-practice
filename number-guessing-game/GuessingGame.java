import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        // Create Random and Scanner objects
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 0 and 100 (inclusive)
        int targetNumber = random.nextInt(101);
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        // Loop until the user guesses the correct number
        while (true) {
            System.out.print("Enter your guess (0-100): ");
            int userGuess = scanner.nextInt();

            // Validate the user's input
            if (userGuess < 0 || userGuess > 100) {
                System.out.println("Invalid input! Please enter a number between 0 and 100.");
                continue; // Prompt the user to guess again
            }

            // Check if the user's guess is correct
            attempts++;
            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You've guessed the correct number: " + targetNumber);
                System.out.println("It took you " + attempts + " attempts.");
                break; // Exit the loop if the guess is correct
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        // Close the scanner
        scanner.close();
    }

}