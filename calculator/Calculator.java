package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // Display a welcome message
        System.out.println("========== Welcome to the Calculator! ==========\n");

        // Create an instance of the Scanner class to read user input
        Scanner scanner = new Scanner(System.in);

        while(true) {
            // Display Menu
            displayMenu();

            // Read the user's choice
            System.out.print("choice: ");
            int choice = scanner.nextInt();

            if (choice == 2) {
                System.out.println("Exiting the calculator. Goodbye!");
                scanner.close();
                return;
            } else if (choice != 1) {
                System.out.println("ERROR: Invalid choice. Please select 1 or 2.");
                continue;
            }

            // Read the user input
            System.out.print("\nEnter first number: ");
            double firstNumber = scanner.nextDouble();

            System.out.print("Enter operator: ");
            String operator = scanner.next();

            System.out.print("Enter second number: ");
            double secondNumber = scanner.nextDouble();

            // Perform the calculation based on the operator
            double result;

            switch (operator) {
                case "+":
                    result = add(firstNumber, secondNumber);
                    break;
                case "-":
                    result = subtract(firstNumber, secondNumber);
                    break;
                case "*":
                    result = multiply(firstNumber, secondNumber);
                    break;
                case "/":
                    try {
                        result = divide(firstNumber, secondNumber);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                case "%":
                    try {
                        result = modulus(firstNumber, secondNumber);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                case "^":
                    result = power(firstNumber, secondNumber);
                    break;
                default:
                    System.out.println("ERROR: Invalid operator. Please use +, -, *, /, %, or ^.\n");
                    System.out.println("--------------------------------------\n");
                    continue;
            }
            System.out.println("\nRESULT: " + result);
            System.out.println("======================================\n");
        }
    }

    public static void displayMenu() {
        System.out.println("Please select an option:");
        System.out.println("1. Calculate");
        System.out.println("2. Exit");
        System.out.println("--------------------------------------");
    }

    public static double add(double first, double second) {
        return first + second;
    }

    public static double subtract(double first, double second) {
        return first - second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double divide(double first, double second) {
        
        if (second == 0 ) {
            throw new IllegalArgumentException("ERROR: Cannot divide by zero.");
        }

        return first / second;
    }

    public static double modulus(double first, double second) {
        if (second == 0 ) {
            throw new IllegalArgumentException("ERROR: Cannot perform modulus by zero.");
        }

        return first % second;
    }

    public static double power(double first, double second) {
        return Math.pow(first, second);
    }
    
}
