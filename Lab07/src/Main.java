import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		GreaterThan obj1;
		GreaterThan obj2;

		String obj = input.next();

		if (obj.equalsIgnoreCase("person")) {
			int personId = input.nextInt();
			obj1 = new Person(personId);
		}else {
			int personId = input.nextInt();
			int employeeSalary = input.nextInt();
			obj1 = new Employee(personId, employeeSalary);
		}
		
		obj = input.next();

		if (obj.equalsIgnoreCase("person")) {
			int personId = input.nextInt();
			obj2 = new Person(personId);
		}else {
			int personId = input.nextInt();
			int employeeSalary = input.nextInt();
			obj2 = new Employee(personId, employeeSalary);
		}
		input.close();
		if(obj1.greaterThan(obj2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		
	}
}
