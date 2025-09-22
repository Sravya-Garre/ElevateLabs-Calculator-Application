package com.nt.calc;

import java.util.Scanner;

public class CalculatorApp {
	public static double add(double a,double b) {
		return a+b;
	}
	public static double sub(double a,double b) {
		return a-b;
	}
	public static double mul(double a,double b) {
		return a*b;
	}
	public static double div(double a, double b) {
	    if (b == 0) {
	        System.out.println("Error: Division by zero is not allowed.");
	        return b; 
	    }
	    return a / b;
	}

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalc = true;

        while (continueCalc) {
            // Menu
        	System.out.println("Welcome to the calculator Application");
            System.out.println("\n=== Calculator Menu ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting... Thank you!");
                continueCalc = false;
                break;
            }

            // Get input numbers
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            // Perform operation
            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + sub(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + mul(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + div(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1–5.");
            }
        }

        scanner.close();
    }


}
