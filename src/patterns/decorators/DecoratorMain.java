package patterns.decorators;

public class DecoratorMain {

	public static void main(String[] args) {

		System.out.println("***Decorator pattern Demo***");

		Car sportCar = new SportsCar(new BasicCar());
		sportCar.assemble();
		System. out. println("\n*****");

		Car luxSportCar = new LuxuryCar(sportCar);
		luxSportCar.assemble();
	}
}
