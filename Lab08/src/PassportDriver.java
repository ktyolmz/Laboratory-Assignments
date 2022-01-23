import java.text.ParseException;
import java.util.Scanner;

public class PassportDriver {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Passport[] passports = new Passport[5];

		String name, passportNo, issueDate, expiryDate;

		for (int i = 0; i < 5; i++) {
			try {
				name = input.nextLine();
				passportNo = input.nextLine();
				issueDate = input.nextLine();
				expiryDate = input.nextLine();
				Passport p = new Passport(name, passportNo, issueDate, expiryDate);
				passports[i] = p;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DatesNotValidException e) {
				System.out.println(e.toString());
				passports[i] = null;
			}

		}
		input.close();
		for (int i = 0; i < 5; i++) {
			if (passports[i] != null) {
				System.out.println(passports[i].toString());
			} else {
				System.out.println("null");
			}
		}

	}

}
