package unitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.CreditCard;

class CreditCardTest {

	@Test
	void testAmount() {
		CreditCard card = new CreditCard("1100212252631425","20280106","652");
		
		String number = card.getNumber();
		String date = card.getDate();
		String cvv = card.getCVV();
		
		assertEquals("1100212252631425", number);
		assertEquals("20280106", date);
		assertEquals("652", cvv);
		
		int amount = 5000;
		
		card.setAmount(amount);
		assertEquals(amount, card.getAmount());
	}
}
