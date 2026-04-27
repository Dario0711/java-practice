package exercises;

public class ArrayStats {
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 22, 41, 5, 11, 25, 30, 40, 91};
		getArrayStats(arr);
	}
	
	public static void getArrayStats(int[] array) {
		int highestNumber = array[0];
		int lowestNumber = array[0];
		int arraySum = 0;
		double arrayAverage = 0.0;
		for (int i = 0; i < array.length; i++) {
			arraySum += array[i];
			if (highestNumber < array[i]) {
				highestNumber = array[i];
			}
			if (lowestNumber > array[i]) {
				lowestNumber = array[i];
			}
		}
		System.out.println("Max: " + highestNumber);
		System.out.println("Min: " + lowestNumber);
		System.out.println("Sum: " + arraySum);
		System.out.println("Average: " + (double) arraySum / array.length);
	}
}