package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		try {
			
		System.out.println("Please enter a number: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Please enter another number: ");
		int num2 = scanner.nextInt();
		
		System.out.println("Result of division = " + (num1/num2));
	}
		
		catch(ArithmeticException e) {
			System.out.println("Please do not enter a zero in the denominator");
		}
		
		catch(InputMismatchException e) {
			System.out.println("Only integer values are allowed");
		}
		
		catch(Exception e) {
			System.out.println("Please enter a valid numeric input");
		}
		
	}	
}
