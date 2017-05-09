package patterns.bridge;

public class BridgeMain {

	public static void main(String[] args) {
		
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		Shape pen = new Pentagon(new GreenColor());
		pen.applyColor();
	}
}
