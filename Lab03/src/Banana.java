public class Banana implements Fruit{
	
	private double priceBanana; 
	private String arrivedDayBanana;
	
	public Banana(double priceBanana, String arrivedDayBanana) {
		this.arrivedDayBanana = arrivedDayBanana;
		this.priceBanana = priceBanana;
	}
	
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.priceBanana;
	}

	@Override
	public String getArrivalDay() {
		// TODO Auto-generated method stub
		return this.arrivedDayBanana;
	}

}