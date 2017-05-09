package patterns.decorators;

public class SportsCar extends CarDecorator {

	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		super.car.assemble();
		System.out.print("Adding features of Sports Car.");
	}
}
