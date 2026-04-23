
import java.util.InputMismatchException;
import java.util.Scanner;  // Import the Scanner class

public class SimpleCalculator {
	
	public static void main(String[] args) {
		runCalculator();
	}
	
	
	public static void runCalculator() {
		Scanner myScanner = new Scanner(System.in);
		
		double firstNumber = getValidNumber(myScanner, "Enter First Number:");
		double secondNumber = getValidNumber(myScanner, "Enter Second Number:");
		
		System.out.println("Enter calculationway (+, -, *, /):");
		char c = ' ';
		boolean validOperator = false;
		
		while (!validOperator) {
			c = myScanner.next().charAt(0);
			
			if (c == '+' || c == '-' || c == '*' || c == '/') {
				validOperator = true;
			}
			else {
				System.out.println("Invalid input. Please enter +, -, *, or /:");
			}
		}
		
		
		double rechnung = 0; // Initialized to 0
		
		if (c == '+') {
			rechnung = firstNumber + secondNumber;
			System.out.println("Result: " + rechnung);
		}
		else if (c == '-') {
			rechnung = firstNumber - secondNumber;
			System.out.println("Result: " + rechnung);
		}
		else if (c == '*') {
			rechnung = firstNumber * secondNumber;
			System.out.println("Result: " + rechnung);
		}
		else if (c == '/') {
			if (secondNumber != 0) {
				rechnung = firstNumber / secondNumber;
				System.out.println("Result: " + rechnung);
			}
			else {
				System.out.println("Error: Cannot divide by zero.");
			}
		}
		else {
			System.out.println("Invalid operator.");
		}
	}
	
	public static double getValidNumber(Scanner scanner, String prompt) {
		double number = 0;
		boolean isValid = false;
		
		while (!isValid) {
			System.out.println(prompt);
			try {
				number = scanner.nextDouble();
				isValid = true;
			} catch (InputMismatchException e) {
				System.out.println("Only Numbers are valid.");
				scanner.next(); // Clear invalid input
			}
		}
		return number;
	}
}

	


