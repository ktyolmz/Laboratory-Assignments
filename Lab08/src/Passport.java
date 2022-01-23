import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Passport {
	private String name;
	private String passportNo;
	private Date issueDate;
	private Date expiryDate;

	SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");

	public Passport(String name, String passportNo, String issueDate, String expiryDate)
			throws ParseException, DatesNotValidException {
		this.name = name;
		this.passportNo = passportNo;
		Date dt1, dt2;
		dt1 = ft.parse(issueDate);
		dt2 = ft.parse(expiryDate);
		if (dt1.before(dt2)) {
			this.issueDate = dt1;
			this.expiryDate = dt2;
		} else {
			throw new DatesNotValidException(issueDate, expiryDate);
		}
	}

	@Override
	public String toString() {
		String str = "Name: " + name + ", Passport Number: " + passportNo + ", Issue Date: " + ft.format(issueDate)
				+ ", Expiry Date: " + ft.format(expiryDate);
		return str;
	}

}
