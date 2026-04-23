public class FizzBuzz {
	static void main(String[] args) {
		fizzbuzz(100);
	}
	
	public static void fizzbuzz(int number) {
		for (int i = 1; number >= i; i = i + 1) {
			
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println(i + " FizzBuzz");
				}
				else {
					System.out.println(i + " Fizz");
				}
			}
			else if (i % 5 == 0) {
				System.out.println(i + " Buzz");
				
			}
			else {
				System.out.println(i);
			}
			
		}
	}
	
	
}
