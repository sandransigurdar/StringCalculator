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

    @Test 
    public void testAddEnterComma() {
    	assertEquals(6, StringCalculator.Add("1\n2,3"));
    }

    @Test
    public void testNegatives() {
    	//RuntimeException e = null;
    	//ExpectedException thrown = null;
    	try {
    		StringCalculator.Add("-1,2");
    	 	//assertEquals("Negatives not allowed: -1", StringCalculator.Add("-1"))
    	}
    	catch(RuntimeException e){
    		assertEquals("Negatives not allowed: -1", e.getMessage());
    	}
    }
}