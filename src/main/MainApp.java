package main;
import strategy.PaymentByCreditCard;
import strategy.PaymentByPayPal;

public class MainApp {

	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService();
        // The strategy can now be easily picked at runtime

        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.processOrder(100);

        System.out.println("==========================================");

        paymentService.setStrategy(new PaymentByPayPal());
        paymentService.processOrder(100);
	}
}
