
public class Walnut  extends Tree {
	
	public Walnut(int length, double waterNeed) {
		this.length=length;
		this.waterNeed=waterNeed;
	}
	
	public void Harvest(int weight) {
		if(weight < 60) {
			System.out.println("The harvest is not efficient.");
		}else {
			System.out.println("The harvest is efficient.");
		}
	}
	
}
