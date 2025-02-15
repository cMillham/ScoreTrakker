
public class Student implements Comparable<Student>{

	private String name;
	private int score;
	
	Student(String name, int score) {
		name = this.name;
		score = this.score;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Student Score List\n" +  name + " " + score + "\n";
	}
	
	
	
}
