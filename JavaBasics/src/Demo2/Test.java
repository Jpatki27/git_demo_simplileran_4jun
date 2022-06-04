package Demo2;

public class Test {
	
	public String getFullName(String firstName) {
		
		String fullName = firstName + " Jackson";
		return fullName;
	}

	public static void main(String[] args) {
		Test test = new Test();
		
		String completeName = test.getFullName("Michael");
		
		System.out.println(completeName);
	}
}
