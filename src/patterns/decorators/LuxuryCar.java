package patterns.decorators;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		super.car.assemble();
		System.out.print("Adding features of Luxury Car.");
	}
}
