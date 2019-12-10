import java.util.Scanner;

public class IntRate {
	
	public static float accBal , intRate, time, totalInt, afterBal;
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Banking app
		
		takeInput();
		calculateInterest();
			
		System.out.printf("Total interest is  = £" + "%.2f", totalInt );

		System.out.println("\n" + afterBal);
	}
	
	public static void takeInput() {
		
		System.out.println("Please enter account balance:  £");
		accBal = scanner.nextFloat();
		
		System.out.println("Please enter rate of interest in percentage: ");
		intRate = scanner.nextFloat();
		
		System.out.println("Please enter number of years :");
		time = scanner.nextFloat();
		
		scanner.close();
		
		
	}
	
	public static float calculateInterest() {
		
		totalInt = (accBal * intRate * time)/100;
		
		afterBal = accBal + totalInt;
		
		return afterBal;
		
	}

}
