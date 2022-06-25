package collectionsFramework;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> cities = new HashSet();
		
		//storing values in computer's memory
				cities.add("London");
				cities.add("Paris");
				cities.add("New York");
				cities.add("New Delhi");
				cities.add("Tokyo");
				
				//retrieve the values
				for (String t : cities) {
					System.out.println(t);
			}
				//retrieve the item stored in index 2
				//System.out.println("Item stored in Index 2 = " + cities.get(2));
				//What is the index of New York
				//System.out.println("Index of New York = " + cities.indexOf("New York"));
				//Total items
				System.out.println("Total items stored in the computer's memory = " + cities.size());
			
		
	}

}
