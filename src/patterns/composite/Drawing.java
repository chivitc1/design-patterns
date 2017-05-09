package patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

	// collection of Shapes
	private List<Shape> shapes = new ArrayList<Shape>();

	@Override
	public void draw(String fillColor) {

		for (Shape sh : shapes) {
			sh.draw(fillColor);
		}
	}

	// adding shape to drawing
	public void add(Shape sh) {
		this.shapes.add(sh);
	}

	// removing shape from drawing
	public void remove(Shape sh) {
		shapes.remove(sh);
	}

	// removing all the shapes
	public void clear() {
		System.out.println("Clearing all the shapes from drawing");
		this.shapes.clear();
	}
}
