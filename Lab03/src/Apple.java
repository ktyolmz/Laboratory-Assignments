public class Apple implements Fruit{

private double applePrice;
private String arrivedDayApple;
	
	public Apple(double applePrice, String arrivedDayApple) {
		this.applePrice= applePrice;
		this.arrivedDayApple = arrivedDayApple;
	}


	@Override
	public String getArrivalDay() {
	
		return this.arrivedDayApple;
	}


	@Override
	public double getPrice() {
		
		return this.applePrice;
	}
	
	
	

}