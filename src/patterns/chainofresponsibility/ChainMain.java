package patterns.chainofresponsibility;

import java.util.Scanner;

public class ChainMain {

	private IDispenseChain c1;

	public ChainMain() {
		// initialize the chain
		this.c1 = new Dollar50Dispenser();
		IDispenseChain c2 = new Dollar20Dispenser();
		IDispenseChain c3 = new Dollar10Dispenser();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		ChainMain atmDispenser = new ChainMain();
		Scanner input = new Scanner(System.in);
		try {
			while (true) {
				int amount = 0;
				System.out.print("Enter amount to dispense: ");

				amount = input.nextInt();
				if (amount % 10 != 0) {
					System.out.println("Amount should be in multiple of 10s.");
					return;
				}
				// process the request
				atmDispenser.c1.dispense(new Currency(amount));

			}
		} finally {
			input.close();
		}
	}
}
