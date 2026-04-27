package exercises;

import java.util.Scanner;  // Import the Scanner class

public class TemperatureConverter {
	
	public static void main(String[] args) {
		convertTemp();
	}
	
	public static void convertTemp() {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter Temperature in Celsius (or 'quit' to exit)");
		
		while (true) {
			String input = myScanner.nextLine();
			
			if (input.equalsIgnoreCase("quit")) {
				System.out.println("Goodbye!");
				break;
			}
			
			try {
				double temperatureInCelsius = Double.parseDouble(input);
				double convertedTemperatureInFahrenheit = (temperatureInCelsius * (9.0 / 5)) + 32;
				System.out.println("Temperature in Fahrenheit is: " + convertedTemperatureInFahrenheit);
				
			} catch (NumberFormatException e) {
				System.out.println("Only numbers or 'quit' are valid");
			}
		}
	}
}
