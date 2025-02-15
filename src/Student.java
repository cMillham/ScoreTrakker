//Author: Chloe Millham, written 2/13/2025
//Student Class: initializes name and score variables, allows student objects to be compared by name and sorted properly
//also contains a toString() method to properly format the student's name and score
public class Student implements Comparable<Student>{

	private String name;
	private int score;
	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Student other) {
		int order = this.name.compareTo(other.name);
		if(order == 0) {
			return other.score - this.score;
		}
		return order;
	}

	@Override
	public String toString() {
		return  name + " " + score;
	}
	
	
	
}
