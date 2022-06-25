package areaCalculation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeAreaCalc {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
				
		System.out.println("Do you want to calculate the shape of a rectangle or triangle?");
		String day = scanner.nextLine();
		
		if (day.equals("rectangle")){
			
			System.out.println("Please enter the length in whole feet: ");
			int num1 = scanner.nextInt();
			
			System.out.println("Please enter the width in whole feet: ");
			int num2 = scanner.nextInt();
			
			System.out.println("The area of your rectangle = " + (num1*num2) + " square feet");
			
		}
		
		
		else {
			
			System.out.println("Please enter the base in whole feet: ");
			int num1 = scanner.nextInt();
			
			System.out.println("Please enter the height in whole feet: ");
			int num2 = scanner.nextInt();
			
			System.out.println("The area of your triangle = " + (num1*num2)/2 + " square feet");
			
		}
	}
}
		

