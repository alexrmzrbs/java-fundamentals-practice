package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // Create an instance of the Scanner class to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");
        System.out.println("Please enter your expression in the format: number1 operator number2");
        System.out.println("For example: 5 + 3");

        // Read the user input
        System.out.print("Enter first number: ");
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
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
                scanner.close();
                return;
        }
        System.out.println("\nResult: " + result);

        // Close the scanner to prevent resource leaks
        scanner.close();
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
            throw new IllegalArgumentException("Cannot divide by zero.");
        }

        return first / second;
    }
    
}
