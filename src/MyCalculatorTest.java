import static org.junit.Assert.*;

import org.junit.Test;


public class MyCalculatorTest {

	@Test
	public void testNfactorial() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.nfactorial(5);
		assertEquals("5! = 120",120,actual,0.0);
		
	}
	
	public void testNfactorial0() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.nfactorial(0);
		assertEquals("0! = 1",1,actual,0.0);
		
	}
	public void testNfactorial1() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.nfactorial(1);
		assertEquals("1! = 1",1,actual,0.0);
		
	}
	
	public void testNfactorial2() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.nfactorial(2);
		assertEquals("2! = 2",2,actual,0.0);
		
	}
	public void testNfactorial_negative() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.nfactorial(-1);
		assertEquals("-1! = error",-1,actual,0.0);
		
	}

}
