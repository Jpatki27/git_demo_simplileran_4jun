package exceptionHandling;

import java.util.Scanner;

public class ThrowDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please enter the day: ");
		String day = scanner.nextLine();
		
		
		if (day.equals("Monday")) {
			throw new ArithmeticException();
		}
		
		else {
			System.out.println("Day entered by user = " + day);
		}
	}

}
