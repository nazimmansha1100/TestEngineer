import java.util.Scanner;

public class ArrayPractice1 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// program takes user input in form of array

		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();

		}

		printArray(numbers);
		
		//sortArray(numbers);
		
		System.out.println(getAverage(numbers));

	}

	private static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.println("item in box " + i + " of numbers array is: " + array[i]);
		}

	}
	
	private static double getAverage(int[] array) {
		int total = 0;
		int length = array.length;
		double average;
		
		for(int i = 0; i<length; i++) {
			total = total + array[i];
		}
		
		average = total /length;
		return average;
		
	}
	
	

}




