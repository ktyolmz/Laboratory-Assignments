import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
		// main function tests the functionality of Package and Vehicle classes.

		Scanner input = new Scanner(System.in);

		int number;
		number = input.nextInt();

		//creating array of Vehicle object
		Vehicle[] vehicles = new Vehicle[number];
		
		for (int i = 0; i < number; i++) {
			String registrationNo = input.next();
			int maxLoadCap = input.nextInt();
			int nPackages = input.nextInt();

			vehicles[i] = new Vehicle(registrationNo, maxLoadCap, nPackages);
			vehicles[i].validate();
			System.out.println(vehicles[i].toString());
		}

		input.close();
	}

}
