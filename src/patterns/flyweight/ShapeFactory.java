package patterns.flyweight;

import java.util.HashMap;

public class ShapeFactory {

	private static final HashMap<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

	public static Shape getShape(ShapeType type) {
		Shape shapeImpl = shapes.get(type);
		if (shapeImpl == null) {
			switch (type) {
			case OVAL_FILL:
				shapeImpl = new Oval(true);
				break;
			case OVAL_NOFILL:
				shapeImpl = new Oval(false);
				break;
			case LINE:
				shapeImpl = new Line();
				break;
			}
			
			shapes.put(type, shapeImpl);
		}
		
		return shapeImpl;
	}

	public static enum ShapeType {
		OVAL_FILL, OVAL_NOFILL, LINE;
	}
}
