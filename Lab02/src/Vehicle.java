
public class Vehicle {

	private String registrationNo;
	private int totalPackagesVolume;
	private int nPackage;

	// m^3
	private int maxLoadCapacity;
	private boolean canDeliverSoon;

	private Package[] packages;

	public Vehicle(String regNumber, int maxLoadCapacity, int nPackages) {
		setTotalPackagesVolume(0);
		setRegistrationNo(regNumber);
		setMaxLoadCapacity(maxLoadCapacity);
		setnPackage(nPackages);

		setCanDeliverSoon(false);

		packages = new Package[nPackages];
		for (int i = 0; i < packages.length; i++) {
			packages[i] = new Package(5, 4, 2);
		}

	}

	public int getnPackage() {
		return nPackage;
	}

	public void setnPackage(int nPackage) {
		this.nPackage = nPackage;
	}

	public int getTotalPackagesVolume() {
		return totalPackagesVolume;
	}

	public void setTotalPackagesVolume(int totalPackagesVolume) {
		this.totalPackagesVolume = totalPackagesVolume;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public int getMaxLoadCapacity() {
		return maxLoadCapacity;
	}

	public void setMaxLoadCapacity(int maxLoadCapacity) {
		this.maxLoadCapacity = maxLoadCapacity;
	}

	public Package[] getPackages() {
		return packages;
	}

	public void setPackages(Package[] packages) {
		this.packages = packages;
	}

	public boolean isCanDeliverSoon() {
		return canDeliverSoon;
	}

	public void setCanDeliverSoon(boolean canDeliverSoon) {
		this.canDeliverSoon = canDeliverSoon;
	}

	// validate method checks the total volume of packages is validate to delivery.
	public void validate() {

		int sum = 0;

		for (int i = 0; i < packages.length; i++) {
			sum = (sum + packages[i].calculatePackageVolume());
			setTotalPackagesVolume(sum);
		}

		if (getTotalPackagesVolume() <= getMaxLoadCapacity()) {
			setCanDeliverSoon(true);
		} else {
			setCanDeliverSoon(false);
		}
	}

	// toString method returns to expected message
	public String toString() {
		String message = "";
		String message1 = "Vehicle no." + getRegistrationNo() + " has maximum loading capacity of "
				+ getMaxLoadCapacity() + " m3. It carries " + getnPackage() + " packages with total dimension of "
				+ getTotalPackagesVolume() + " m3.";

		if (isCanDeliverSoon()) {
			String message2 = " Your package will be delivered soon.";
			message = message1.concat(message2);
			return message;
		} else {
			String message2 = " Your package will not be delivered soon.";
			message = message1.concat(message2);
			return message;
		}

	}

}
