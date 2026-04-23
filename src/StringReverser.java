import java.util.Scanner;

public class StringReverser {
	public static void main(String[] args) {
		reverseString();
	}
	public static void reverseString() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter String you want to reverse (or ':quit' to exit)");
		while (true) {
			String input = myScanner.nextLine();
			String output = "";
			if (input.equalsIgnoreCase(":quit")) {
				System.out.println("Goodbye!");
				break;
			}
			for (int i = input.length() - 1; i >= 0; i--) {
				output += input.charAt(i);
			}
			System.out.println(output);
		}
	}
}