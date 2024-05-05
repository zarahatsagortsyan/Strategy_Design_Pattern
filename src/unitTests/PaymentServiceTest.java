package unitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.PaymentService;
import strategy.PaymentByCreditCard;
import strategy.PaymentByPayPal;

class PaymentServiceTest {

	@Test
	void testPayment() {
		PaymentService paymentService = new PaymentService();
        // The strategy can now be easily picked at runtime

        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.processOrder(100);
        
        assertEquals(110, paymentService.getTotal());

        System.out.println("==========================================");

        paymentService.setStrategy(new PaymentByPayPal());
        paymentService.processOrder(350);
        assertEquals(360, paymentService.getTotal());
	}

}
