import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        //Print welcome message
        System.out.println("========== Welcome to the Student Grade Calculator ==========\n");

        //Initialize Scanner
        Scanner scanner = new Scanner(System.in);

    }

    public static void displayMenu() {
        System.out.println("========== Student Grade Calculator Menu ==========");
        System.out.println("1. Input Grades");
        System.out.println("2. Display Grade Report");
        System.out.println("3. Highest Grade");
        System.out.println("4. Lowest Grade");
        System.out.println("5. Average Grade");
        System.out.println("6. Count of Passing Grades");
        System.out.println("7. Count of Failing Grades");
        System.out.println("8. Determine Letter Grade");
        System.out.println("9. Exit");
        System.out.println("====================================================");
    }

    public static double validateUserChoice(Scanner scanner, double min, double max) {
        
        //Prompt user for input
        double userChoice;

        System.out.print("Enter your choice: ");
        userChoice = scanner.nextDouble();

        //Validate user input
        while (userChoice < min || userChoice > max) {
            System.out.print("Invalid choice. Please enter a value between " + min + " and " + max + ": ");
            userChoice = scanner.nextDouble();
        }
        //Return the validated user choice
        return userChoice;
    }

    public static void inputGrades(Scanner scanner, double[] grades) {
    }

    public static void displayGradeReport(double[] grades) {
    }

    public static void highestGrade(double[] grades) {
    }

    public static void lowestGrade(double[] grades) {
    }

    public static void calculateAverageGrade(double[] grades) {
    }

    public static void passingGradeCount(double[] grades) {
    }

    public static void failingGradeCount(double[] grades) {
    }

    public static void determineLetterGrade(double average) {
    }

}