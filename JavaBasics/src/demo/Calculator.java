package demo;

public class Calculator {
	//defining the add () method below
	public void add (int a, int b) {
		System.out.println(a+b);
	}
	
	public void subtract (int a, int b) {
		System.out.println(a-b);
	}
	
	public void multiply (int a, int b) {
		System.out.println(a*b);
	}
	
	public void divide (int a, int b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		//Class object = new Class()
		Calculator basicCalculator = new Calculator();
		
		//object method
		basicCalculator.add(10, 20);
		basicCalculator.subtract(100,50);
		basicCalculator.multiply (16, 8);
		basicCalculator.divide(20, 5);
	
	}
	
	
	

}
