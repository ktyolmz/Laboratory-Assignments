import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		String obj;
		GreaterThan[] arr = new GreaterThan[5];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			obj = input.next();

			if (obj.equalsIgnoreCase("person")) {
				int personId = input.nextInt();
				arr[i] = new Person(personId);
			} else {
				int personId = input.nextInt();
				int employeeSalary = input.nextInt();
				arr[i] = new Employee(personId, employeeSalary);
			}
		}
		input.close();
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j].greaterThan(arr[j+1])) {
					GreaterThan temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
		     if(arr[i] instanceof Employee) {
				System.out.print(((Employee)arr[i]).salary + " ");
			}
			else if(arr[i] instanceof Person) {
				System.out.print(((Person)arr[i]).id + " ");
			}
		}
		

	}

}
