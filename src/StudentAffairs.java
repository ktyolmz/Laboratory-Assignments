
public class StudentAffairs {

	public static void main(String[] args) {
		
			Student[] st = new Student[10] ;
			
			
			//Adding students with their courses and grades then calculating max grade for each student
			
			Student student1 = new Student("Margot Roman");
			st[0]=student1;
			student1.addCourse("Chemistry", 88);
			student1.addCourse("Biology", 88 );
			student1.calculateMax();
			
			Student student2 = new Student("Isabella Davies");
			st[1]=student2;
			student2.addCourse("Math", 36);
			student2.addCourse("Biology", 46);
			student2.calculateMax();
			
			Student student3 = new Student("Murphy Meyer");
			st[2]=student3;
			student3.addCourse("Math", 70);
			student3.addCourse("Chemistry", 55);
			student3.calculateMax();
			
			Student student4 = new Student("Lawrence Marquez");
			st[3]=student4;
			student4.addCourse("Physics", 22);
			student4.addCourse("Chemistry", 28);
			student4.addCourse("Biology", 92);
			student4.calculateMax();
			
			Student student5 = new Student("Chay Skinner");
			st[4]=student5;
			student5.addCourse("Math", 66);
			student5.addCourse("Physics", 44);
			student5.addCourse("Biology", 39);
			student5.calculateMax();
			
			Student student6 = new Student("May Banks ");
			st[5]=student6;
			student6.addCourse("Chemistry", 49);
			student6.calculateMax();
			
			Student student7 = new Student("Presley Morgan");
			st[6]=student7;
			student7.addCourse("Physics", 88);
			student7.addCourse("Biology", 74);
			student7.calculateMax();
			
			Student student8 = new Student("Alysha Caldwell");
			st[7]=student8;
			student8.addCourse("Math", 49);
			student8.addCourse("Physics", 22);
			student8.addCourse("Biology", 55);
			student8.calculateMax();
			
			Student student9 = new Student("Kirby Aguilar");
			st[8]=student9;
			student9.addCourse("Math", 82);
			student9.addCourse("Physics", 77);
			student9.addCourse("Chemistry", 65);
			student9.calculateMax();
			
			Student student10 = new Student("Edna Padilla ");
			st[9]=student10;
			student10.addCourse("Physics", 59);
			student10.calculateMax();
			
			//Find max grade for each course
			
			double maxMath = 0;
			double maxPhysics = 0;
			double maxChemistry = 0;
			double maxBiology= 0;
			
			
			for(Student student: st) {
				for(int i=0; i<student.getCourses().length; i++) {
					if (student.getCourses()[i] == (null)) {
						break;
					}
					else if(student.getCourses()[i].equals("Math")) {
						if(maxMath < student.getGrades()[i]) {
							maxMath = student.getGrades()[i];
						}
					}else if(student.getCourses()[i].equals("Physics")) {
						if(maxPhysics < student.getGrades()[i]) {
							maxPhysics = student.getGrades()[i];
						}
					}else if(student.getCourses()[i].equals("Chemistry")) {
						if(maxChemistry < student.getGrades()[i]) {
							maxChemistry = student.getGrades()[i];
						}
					}else if(student.getCourses()[i].equals("Biology")) {
						if(maxBiology < student.getGrades()[i]) {
							maxBiology = student.getGrades()[i];
						}
					}
				}
			}
			
			System.out.println("101 - Math: " + maxMath);
			System.out.println("102 - Physics: " + maxPhysics);
			System.out.println("103 - Chemistry: " + maxChemistry);
			System.out.println("104 - Biology: " + maxBiology);
		}
	}


