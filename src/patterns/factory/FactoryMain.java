package patterns.factory;

public class FactoryMain {

	public static void main(String[] args) {

		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "250 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("Server", "32 GB", "1 TB", "2.9 GHz");

		System.out.println("Factory PC Config::" + pc);
		System.out.println("Factory Server Config::" + server);
	}
}
