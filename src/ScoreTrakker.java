import java.util.ArrayList;

public class ScoreTrakker {

	private ArrayList<Student> students = new ArrayList<Student>();
	
	void loadDataFile(String fileName) {}
	
	void printInOrder() {}
	
	void processFiles() {
		loadDataFile("scores.txt");
		printInOrder();
	}
	
	static void main(String[] args) {
		ScoreTrakker scoreTrakker = new ScoreTrakker();
		scoreTrakker.processFiles();
				
	}
}
