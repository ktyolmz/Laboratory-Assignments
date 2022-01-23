import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int i = keyboard.nextInt();
		System.out.print(sumOfDigits(i));
		keyboard.close();
	}

	public static int sumOfDigits(int i) {

		if (i == 0) {
			return 0;
		}

		else {
			return (i % 10 + sumOfDigits(i / 10));
		}

	}

}
