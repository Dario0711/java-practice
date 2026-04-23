import java.util.InputMismatchException;
import java.util.Scanner;  // Import the Scanner class

public class TemperatureConverter {
	
	public static void main(String[] args) {
		ConvertTemp();
	}
	
	
	public static void convertTemp() {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter Temperature in Celsius");
		
		do {
			try {
				double temperatureInCelsius = myScanner.nextDouble();
				
				double convertedTemperatureInFahrenheit = (temperatureInCelsius * (9.0 / 5)) + 32;
				
				System.out.println("Temperature in Fahrenheit is: " + convertedTemperatureInFahrenheit);
				
			} catch (InputMismatchException e) {
				System.out.println("Only Numbers are valid");
				myScanner.next();
			}
		} while (true);
	}
}
