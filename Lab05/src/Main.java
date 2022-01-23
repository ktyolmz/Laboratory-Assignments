
public class Main {

	public static void main(String[] args) {
		BlueSpruce blueSpruce = new BlueSpruce(25 , 7.3);
		Walnut walnut = new Walnut(33 , 17.5);
		
		if(blueSpruce.length < walnut.length) {
			System.out.println("Walnut is higher than Blue Spruce");
		}else if(blueSpruce.length == walnut.length) {
			System.out.println("Walnut is equals to Blue Spruce");
		}else if(blueSpruce.length > walnut.length) {
			System.out.println("Walnut is smaller than Blue Spruce");
		}
		
		if(blueSpruce.waterNeed < walnut.waterNeed) {
			System.out.println("Walnut needs more water than Blue Spruce");
		}else if(blueSpruce.waterNeed == walnut.waterNeed) {
			System.out.println("Walnut needs same amount of water as Blue Spruce");
		}else if(blueSpruce.waterNeed > walnut.waterNeed) {
			System.out.println("Walnut needs less water than Blue Spruce");
		}
		blueSpruce.Price(9.5);
		System.out.println("Average price for Blue Spruce is $" + (int)blueSpruce.getPrice());
		walnut.Harvest(30);
		
	}

}
