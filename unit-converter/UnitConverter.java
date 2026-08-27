import java.util.Scanner;

public class UnitConverter {
 
    
    public static void main(String[] args) {

        // Display a welcome message
        System.out.println("========== Welcome to the Unit Converter! ==========\n");

        //Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Main loop to keep the program running until the user chooses to exit
        while (true) {

            displayMenu();
            int choice = validateUserChoice(scanner);
            System.out.println(); // Print a blank line for better readability
            
            // case for each conversion option
            printSeparator();
            switch (choice) {
                case 1: {
                    System.out.print("Enter the distance in miles: ");
                    double miles = scanner.nextDouble();
                    double kilometers = milesToKilometers(miles);
                    System.out.printf("%.2f miles is equal to %.2f kilometers.%n", miles, kilometers);
                    break;
                }
                case 2: {
                    System.out.print("Enter the distance in kilometers: ");
                    double kilometers = scanner.nextDouble();
                    double miles = kilometersToMiles(kilometers);
                    System.out.printf("%.2f kilometers is equal to %.2f miles.%n", kilometers, miles);
                    break;
                }
                case 3: {
                    System.out.print("Enter the weight in pounds: ");
                    double pounds = scanner.nextDouble();
                    double kilograms = poundsToKilograms(pounds);
                    System.out.printf("%.2f pounds is equal to %.2f kilograms.%n", pounds, kilograms);
                    break;
                }
                case 4: {
                    System.out.print("Enter the weight in kilograms: ");
                    double kilograms = scanner.nextDouble();
                    double pounds = kilogramsToPounds(kilograms);
                    System.out.printf("%.2f kilograms is equal to %.2f pounds.%n", kilograms, pounds);
                    break;
                }
                case 5: {
                    System.out.print("Enter the temperature in Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    double celsius = fahrenheitToCelsius(fahrenheit);
                    System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.%n", fahrenheit, celsius);
                    break;
                }
                case 6: {
                    System.out.print("Enter the temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", celsius, fahrenheit);
                    break;
                }
                case 7: {
                    System.out.println("Exiting the Unit Converter. Goodbye!");
                    scanner.close();
                    return; // Exit the program
                }
                default: {
                    System.out.println("ERROR: Invalid choice. Please select a number between 1 and 7.");
                    break;
                }
            }
            printSeparator();
        }
    }

    public static void displayMenu() {
        System.out.println("========== Unit Converter ==========");
        System.out.println("1. Miles to Kilometers");
        System.out.println("2. Kilometers to Miles");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Fahrenheit to Celsius");
        System.out.println("6. Celsius to Fahrenheit");
        System.out.println("7. Exit");
        System.out.println("====================================");
    }

    public static void printSeparator() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static int validateUserChoice(Scanner scanner) {

        int choice = -1;

        while (choice < 1 || choice > 7) {
            System.out.print("Enter your choice (1-7): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice < 1 || choice > 7) {
                    System.out.println("ERROR: Invalid choice. Please select a number between 1 and 7.");
                }
            } else {
                System.out.println("ERROR: Invalid input. Please enter a number between 1 and 7.");
                scanner.next(); // Clear the invalid input
            }
        }

        return choice;
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
}
