import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Fruit[] fruits;
		int i;
		Scanner input = new Scanner(System.in);
		
		double sumWeekend=0;
		double sumWeek = 0;
		int numberWeekDays = 0;
		int numberWeekendDays = 0;
		
		
		System.out.println("How many fruits? ");
		int numberFruits = input.nextInt();
		fruits = new Fruit[numberFruits];

		System.out.println("How many apples? ");
		int numberApples = input.nextInt();

		for (i = 0; i < numberApples; i++) {
			double priceApple = input.nextDouble();
			String arrivedDayApple = input.next();
			Apple apple = new Apple(priceApple, arrivedDayApple);
			fruits[i] = apple;
		}

		System.out.println("How many oranges? ");
		int numberOranges = input.nextInt();

		int j = numberOranges + numberApples;

		for (i = numberApples; i < j; i++) {
			double priceOrange = input.nextDouble();
			String arrivedDayOrange = input.next();
			Orange orange = new Orange(priceOrange, arrivedDayOrange);
			fruits[i] = orange;
		}

		System.out.println("How many bananas? ");
		int numberBananas = input.nextInt();
		// we can also use (numberBananas + j)  instead of fruits.length
		for (i = j; i < fruits.length; i++) {
			double priceBanana = input.nextDouble();
			String arrivedDayBanana = input.next();
			Banana banana = new Banana(priceBanana, arrivedDayBanana);
			fruits[i] = banana;
		}
		
		
		for (i = 0; i < fruits.length; i++) {

			if(fruits[i].getArrivalDay().equals("saturday") || fruits[i].getArrivalDay().equals("sunday")) {
			numberWeekendDays++;
			} else {
			numberWeekDays++;
			}
		}
		
		
		for(i = 0; i < fruits.length; i++) {
			sumWeek += fruits[i].getPrice();
			if(fruits[i].getArrivalDay().equals("saturday") || fruits[i].getArrivalDay().equals("sunday")) {
				sumWeekend += fruits[i].getPrice();
			}
		}
		
		
		double priceRate1 = (sumWeekend/ sumWeek);
	
		System.out.format("Price rate of the fruits arrived at weekend %.2f.\n", priceRate1);
		System.out.println("Number of arrivals at week days: " + numberWeekDays);
		System.out.println("Number of arrivals at weekend days: " + numberWeekendDays);
		
		input.close();
	}

}