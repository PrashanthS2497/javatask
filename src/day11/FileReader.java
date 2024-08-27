package day11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	    public static void main(String[] args) {
	        File file = new File("nonexistentfile.txt");
	        
	        try {
	            Scanner fileScanner = new Scanner(file);
	            while (fileScanner.hasNextLine()) {
	                System.out.println(fileScanner.nextLine());
	            }
	            fileScanner.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("Error: File not found.");
	        }
	    }
	}

}
