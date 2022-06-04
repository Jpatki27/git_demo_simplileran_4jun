package inheritance;

public class A extends D{
	public void day () {
    	System.out.println("Today is Saturday");
    }
	
	public static void main(String[] args) {
		A a = new A();
		a.day();
		a.date();
		a.nextYear();
	}

}
