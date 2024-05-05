package strategy;

public class PaymentByPayPal implements PaymentStrategy {
	private String email;
	private String password;
	
	@Override
	public void collectPymentDetails(){
		email = "PayPal Mail";
		password = "PayPal Password";
		
		System.out.println("Collecting PatPal Account Details...");
				
	}
	
	@Override
	public boolean validatePaymentDetails(){
		System.out.printf("Validating PayPal info: %s | %s%n", email, password);
		return true;
	}
	
	@Override 
	public void pay(int amount){
		System.out.println("Paying " + amount + " using PayPal");
	}
}
