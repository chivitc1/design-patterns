package patterns.chainofresponsibility;

public class Dollar50Dispenser implements IDispenseChain {
	private IDispenseChain nextChain;

	@Override
	public void setNextChain(IDispenseChain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {

		if (currency.getAmount() >= 50) {
			// Try to process
			int num = currency.getAmount() / 50;
			int remainder = currency.getAmount() % 50;
			System.out.println("Dispensing " + num + " 50$ note");

			// Forward remain task to chain
			if (remainder != 0)
				this.nextChain.dispense(new Currency(remainder));

		} else {
			// Cann't process any thing then foward all to the chain
			this.nextChain.dispense(currency);
		}
	}
}
