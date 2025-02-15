//Author: Chloe Millham, written 2/13/2025
import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.TreeSet;

public class ScoreTrakker {
	
	private String[] files = {"scores.txt", "badscore.txt", "nofile.txt" };
	private ArrayList<Student> students = new ArrayList<Student>();
	
	//loadDataFile: takes a file name as a parameter, initializes the name and score variables for the student object
	//creates a file reader and scanner to take in input and properly store data in the student object
	//the method also has a try/catch for the case of the input file not having correctly formatted data (an invalid score)
	void loadDataFile(String fileName) throws IOException {
		String name = "";
		String score = "";
		
		FileReader filereader = new FileReader(fileName);
		Scanner scanner = new Scanner(filereader);
		while (scanner.hasNext()) {
			try {
				name = scanner.nextLine();
				score = scanner.nextLine();
				students.add(new Student(name, Integer.parseInt(score)));
			} catch (NumberFormatException e) {
				System.out.println("Incorrect format for " + name + " not a valid score: " + score + "\n");
			}
			filereader.close();
		}
	}
	
	//printInOrder: creates a tree set to hold all the student objects and iterates through all the objects in the tree set, printing them properly
	void printInOrder() {
		TreeSet<Student> treeset = new TreeSet<Student>();
		for(Student student : students) {
			treeset.add(student);
		}
		for(Student student : treeset) {
			System.out.println(student);
		}
	}
	
	//processFiles: uses a try/catch to make sure the file can be read, if yes it will print the student objects in the proper order
	//if fails, will throw a "can't open file" error
	void processFiles() throws IOException {
		for(String filename: files)
		try {
			loadDataFile(filename);
			printInOrder();
		} catch (FileNotFoundException e) {
			System.out.println("Can't open file: " + filename);
		}
	}
	
	//Main: creates a scoreTrakker object and calls the processFiles() method
	public static void main(String[] args) throws IOException {
		ScoreTrakker scoreTrakker = new ScoreTrakker();
		scoreTrakker.processFiles();
				
	}
}
