package ForLoopDemo;

import java.util.Scanner;

public class WhileLoopDemo {
	
	public static void main(String[] args) {
		
		int pinInDB = 1234;
		int tries = 0;
		//Class object = new Class()
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your PIN:");
		int pinEnteredByUser = scanner.nextInt();
		tries++;
		
		while((pinEnteredByUser != pinInDB)&& (tries<3)) {
			
			System.out.println("The PIN you entered is incorrect - please try again.");
			pinEnteredByUser = scanner.nextInt();
			tries++;
		}
		
		if ((pinEnteredByUser != pinInDB) && tries ==3) {
			System.out.println("Your ATM card has been blocked");
		}
		
		else if (tries <=3) {
		System.out.println("Welcome to ABC Bank");
		
	}

}
}
