package assign5;
import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {
	Calculator cal=new Calculator();
	@Test
	public void test() {
	
		assertEquals(9,cal.add(4, 5));
		assertEquals(7,cal.subtract(14, 7));
		assertEquals(5,cal.divide(25, 5));
		assertEquals(45,cal.multiply(9, 5));
	}
	@Test (expected = ArithmeticException.class)
	 public void throwsException() {
		cal.divide(25,0);
	}

}
