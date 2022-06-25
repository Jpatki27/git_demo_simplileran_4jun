package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingOnAFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("//home/jasonatkins27gm//Documents//Output");
		PrintWriter printWriter = new PrintWriter(file);
		printWriter.print("Today is Sunday");
		printWriter.close();
		
	}

}
