package patterns.strategy;

public class PaypalStrategy implements IPaymentStrategy {
	private String emailId;
	private String password;

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " paid using Paypal.");
	}

	public PaypalStrategy(String emailId, String password) {
		this.emailId = emailId;
		this.password = password;
	}
}
