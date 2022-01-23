import java.util.Scanner;

public class TimeDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Start");
		int hours = input.nextInt();
		int minutes = input.nextInt();
		int seconds = input.nextInt();
		String period = input.next();

		Time t1 = new Time(seconds, minutes, hours, period);
		int hours2 = input.nextInt();
		int minutes2 = input.nextInt();
		int seconds2 = input.nextInt();
		String period2 = input.next();
		input.close();
		Time t2 = new Time(seconds2, minutes2, hours2, period2);
		Time t3 = new Time();
		t3 = t1.add(t2);
		System.out.println("t1 " + t1.toString());
		System.out.println("t2 " + t2.toString());
		System.out.println("t3 " + t3.toString());

		int c = t1.compareTo(t2);

		switch (c) {
		case -1:
			System.out.println("t1 is less than t2");
			break;
		case 0:
			System.out.println("t1 is equal to t2");
			break;
		case 1:
			System.out.println("t1 is greater than t2");
		}

	}

}
