package strategy;

import main.CreditCard;

public class PaymentByCreditCard implements PaymentStrategy {
	private CreditCard card;
	
	@Override
	public void collectPymentDetails(){
		card = new CreditCard("Card number", "expiryDate", "cvv");
		System.out.println("Collecting Card Details...");		
	}
	
	@Override
	public boolean validatePaymentDetails(){
		System.out.println("Validating Card info: " + card);
		return true;
	}
	
	@Override 
	public void pay(int amount){
		System.out.println("Paying " + amount + " using Credit Card");
		card.setAmount(card.getAmount() - amount);
	}
}

