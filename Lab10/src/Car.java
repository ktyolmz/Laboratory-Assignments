class Car implements Comparable<Car> {
	String ID;
	int regYear;

	public Car(String id, int reg) {
		ID = id;
		regYear = reg;
	}

	public int compareTo(Car c2) {
		return ID.compareTo(c2.ID);
	}

	public String toString() {
		return "ID: " + ID + ", Reg Year" + regYear;
	}
}