package is.ru.hugb;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testEmptyStrResultZero() {
		StringCalculator s = new StringCalculator();
		assertEquals(0, s.Add(""));
	}
}