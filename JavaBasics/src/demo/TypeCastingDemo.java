package demo;

public class TypeCastingDemo {
	public static void main(String[] args) {
		//implicit type casting
		int date = 28;
		double newDate = date;
		System.out.println(newDate);
		
		//explicit type casting
		double height = 78.56;
		int newHeight = (int) height;
		
		System.out.println(newHeight);
	}

}
