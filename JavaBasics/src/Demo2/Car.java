package Demo2;

public class Car {
	private String color;
	private String engineType;
	
	public Car() {
		color = "White";
		engineType = "Petrol";
	}
	
	public Car(String colorOfCar, String typeOfEngine) {
		
		color = colorOfCar;
		engineType = typeOfEngine;
		
	}
	public void printCarInfo () {
		System.out.println("Color of car = " + color);
		System.out.println("Type of engine = " + engineType);
	}
	
	public static void main(String[] args) {
		Car mercedes = new Car("Silver", "Diesel");
		Car audi = new Car("Black", "Petrol");
		Car bmw = new Car();
		Car toyota = new Car();
		
		bmw.printCarInfo();
	}
}
