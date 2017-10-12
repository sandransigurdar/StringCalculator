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

	@Test
    public void testAdding2Nums() {
        assertEquals(7, StringCalculator.Add("2,5"));
    }

 	@Test
    public void testAddmultiple() {
        assertEquals(8, StringCalculator.Add("2,2,2,2"));
    }
}