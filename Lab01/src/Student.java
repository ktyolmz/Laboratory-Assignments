
public class Student {

	private String name;
	private int[] grades;
	private String[] courses;
	int i=0;
	public Student(String name) {
		this.name = name;
		courses= new String[3];
		grades = new int[3];
	}

	public void addCourse(String course, int grade) {
		
			courses[i] = course;
			grades[i] = grade;
			if(i <2) {
				i++;
			}
		

	}

	public void calculateMax() {
		float max = grades[0];
		for(int j=0; j<grades.length; j++) {
			if(grades[i]  > max) {
				max = grades[i];
			}
		}
			System.out.println(this.name + ": " + max);
			
			
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	
}
