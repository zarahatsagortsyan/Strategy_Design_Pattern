package unitTests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CreditCardTest.class, PaymentServiceTest.class })
public class AllTests {

}
