package folder2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App2 {
	public static void main(String[] args) {
		try {
			openFile();
		} catch (FileNotFoundException e) {
			System.out.println("could not open file");
		}
	}
	
	// 2ways to handle exception -> throw exception or wrap inside try-catch block
	
	public static void openFile() throws FileNotFoundException {
		File file = new File("text.txt");
		
		FileReader fr = new FileReader(file);
	}
}
