package demo;

public class Test {
	
	//Access add() method from Calculator class in the Test class
	
	public static void main(String[] args) {
		//Create object of the container class (which contains the methods)
		//Class object = new Class()
		Calculator calculator = new Calculator();
		//object.method()
		calculator.add(10, 15);
	}

}
