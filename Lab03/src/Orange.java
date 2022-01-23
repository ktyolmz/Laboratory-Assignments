public class Orange implements Fruit{
	
	private double priceOrange; 
	private String arrivedDayOrange;
	
	public Orange(double priceOrange, String arrivedDayOrange) {
		this.arrivedDayOrange = arrivedDayOrange;
		this.priceOrange = priceOrange;
	}
	

	@Override
	public double getPrice() {
	
		return this.priceOrange;
	}

	@Override
	public String getArrivalDay() {
		
		return this.arrivedDayOrange;
	}

}
