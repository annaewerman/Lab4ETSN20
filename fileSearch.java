package filesearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileSearch {
	//comments
	
	public fileSearch() {}
	
	public void printLines(String pattern, String fileName) throws FileNotFoundException{
		File file = new File (fileName);
		Scanner readFile = new Scanner(file);
		
		while(readFile.hasNextLine()) {
			String line = readFile.nextLine();
			if(line.toLowerCase().indexOf(pattern.toLowerCase()) != 1) {
				System.out.print(line);
			}
		}
		readFile.close();
	}

public static void main(String[] args) throws FileNotFoundException{

	fileSearch search = new fileSearch();
	String pattern = args[1];
	String fileName = args[2];
	search.printLines(pattern, fileName);
	
}
	
}
