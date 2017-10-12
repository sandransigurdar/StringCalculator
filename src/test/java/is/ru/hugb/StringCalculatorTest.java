package is.ru.StringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testEmptyStrResultZero() {
		assertEquals(0, StringCalculator.Add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(2, StringCalculator.Add("2"));
	}
}