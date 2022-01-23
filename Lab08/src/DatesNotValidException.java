import java.util.Date;

public class DatesNotValidException extends Exception {
	private String issueDate;
	private String expiryDate;

	public DatesNotValidException(String issueDate, String expiryDate) {
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		String str = "Passport expiry date " + expiryDate + " is not after the issue date " + issueDate + ".";
		return str;
	}

}
