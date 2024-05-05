package strategy;

public interface PaymentStrategy {
	void collectPymentDetails();
	boolean validatePaymentDetails();
	void pay(int amount);
}
