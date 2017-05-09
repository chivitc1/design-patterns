package patterns.templatemethod;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with Wood coating");
	}

	/*
	 *  We could have overridden other methods also, 
	 *  but for simplicity I am not doing that.
	 */
}
