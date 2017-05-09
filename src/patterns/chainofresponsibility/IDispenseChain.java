package patterns.chainofresponsibility;

public interface IDispenseChain {

	void setNextChain(IDispenseChain nextChain);
	void dispense(Currency currency);
}
