package patterns.factory.abstractfactory;

import patterns.factory.Computer;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
