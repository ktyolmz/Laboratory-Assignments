
public class BlueSpruce extends Tree {
	private double price;
	
	public BlueSpruce(int length, double waterNeed) {
		this.length=length;
		this.waterNeed=waterNeed;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void Price(double size) {
		if(size < 10.5) {
			setPrice(950);
		}else {
			setPrice(1050);
		}
		
		
	}
	
	
	
	
}
