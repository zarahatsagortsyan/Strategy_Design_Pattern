package main;
import strategy.PaymentStrategy;

public class PaymentService {
	private int cost;
	private boolean includeDelivery = true;

	private PaymentStrategy strategy;

	public void processOrder(int cost){
		this.cost = cost;
		strategy.collectPymentDetails();
		if (strategy.validatePaymentDetails())
		{
			strategy.pay(getTotal());
		}
	}
	
	public int getTotal(){
		return includeDelivery ? cost + 10 : cost;
	}

	public void setStrategy(PaymentStrategy _strategy) {
		strategy = _strategy;
	}
}
