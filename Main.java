import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static double lastResult = 0.0;
    private static List<Double> resultList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            displayMenu();

            System.out.print("Enter your choice (1-10, or 0 to exit): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    exit = true;
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                case 1:
                    performAddition(scanner);
                    break;
                case 2:
                    performSubtraction(scanner);
                    break;
                case 3:
                    performMultiplication(scanner);
                    break;
                case 4:
                    performDivision(scanner);
                    break;
                case 5:
                    performModulus(scanner);
                    break;
                case 6:
                    findMinimum(scanner);
                    break;
                case 7:
                    findMaximum(scanner);
                    break;
                case 8:
                    findAverage(scanner);
                    break;
                case 9:
                    printLastResult();
                    break;
                case 10:
                    printAllResults();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 0 to 10.");
            }
            System.out.println(); // Empty line for clarity
        }

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Calculator Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Find Minimum");
        System.out.println("7. Find Maximum");
        System.out.println("8. Find Average");
        System.out.println("9. Print Last Result");
        System.out.println("10. Print All Results");
        System.out.println("0. Exit");
    }

    public static void performAddition(Scanner scanner) {
        double num1 = getNumberFromUser(scanner, "Enter the first number: ");
        double num2 = getNumberFromUser(scanner, "Enter the second number: ");
        double result = num1 + num2;
        lastResult = result;
        resultList.add(result);
        System.out.println("Result of addition: " + result);
    }

    public static void performSubtraction(Scanner scanner) {
        double num1 = getNumberFromUser(scanner, "Enter the first number: ");
        double num2 = getNumberFromUser(scanner, "Enter the second number: ");
        double result = num1 - num2;
        lastResult = result;
        resultList.add(result);
        System.out.println("Result of subtraction: " + result);
    }

    public static void performMultiplication(Scanner scanner) {
        double num1 = getNumberFromUser(scanner, "Enter the first number: ");
        double num2 = getNumberFromUser(scanner, "Enter the second number: ");
        double result = num1 * num2;
        lastResult = result;
        resultList.add(result);
        System.out.println("Result of multiplication: " + result);
    }

    public static void performDivision(Scanner scanner) {
        double num1 = getNumberFromUser(scanner, "Enter the first number: ");
        double num2 = getNumberFromUser(scanner, "Enter the second number: ");
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
        } else {
            double result = num1 / num2;
            lastResult = result;
            resultList.add(result);
            System.out.println("Result of division: " + result);
        }
    }

    public static void performModulus(Scanner scanner) {
        double num1 = getNumberFromUser(scanner, "Enter the first number: ");
        double num2 = getNumberFromUser(scanner, "Enter the second number: ");
        if (num2 == 0) {
            System.out.println("Error: Modulus by zero");
        } else {
            double result = num1 % num2;
            lastResult = result;
            resultList.add(result);
            System.out.println("Result of modulus: " + result);
        }
    }

    public static void findMinimum(Scanner scanner) {
        double num1 = getNumberFromUser(scanner, "Enter the first number: ");
        double num2 = getNumberFromUser(scanner, "Enter the second number: ");
        double min = Math.min(num1, num2);
        lastResult = min;
        resultList.add(min);
        System.out.println("Minimum number: " + min);
    }

    public static void findMaximum(Scanner scanner) {
        double num1 = getNumberFromUser(scanner, "Enter the first number: ");
        double num2 = getNumberFromUser(scanner, "Enter the second number: ");
        double max = Math.max(num1, num2);
        lastResult = max;
        resultList.add(max);
        System.out.println("Maximum number: " + max);
    }

    public static void findAverage(Scanner scanner) {
        double num1 = getNumberFromUser(scanner, "Enter the first number: ");
        double num2 = getNumberFromUser(scanner, "Enter the second number: ");
        double average = (num1 + num2) / 2;
        lastResult = average;
        resultList.add(average);
        System.out.println("Average of numbers: " + average);
    }

    public static void printLastResult() {
        System.out.println("Last result: " + lastResult);
    }

    public static void printAllResults() {
        System.out.println("All results:");
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println("Result #" + (i + 1) + ": " + resultList.get(i));
        }
    }

    public static double getNumberFromUser(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
}
