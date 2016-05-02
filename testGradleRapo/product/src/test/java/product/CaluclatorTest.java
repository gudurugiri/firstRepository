/**
 * 
 */
package product;

import static org.junit.Assert.*;

import org.junit.Test;

import my.cool.app.BasicCaluclator;

/**
 * @author BUJAIR
 *
 */
public class CaluclatorTest {
	
	
	/**
	 * Addition Test
	 */
	@Test
	public void addition_Success() {
		BasicCaluclator b = new BasicCaluclator();
		double result=b.addition(9.99, 0.01);
		assertEquals(10.0+"", result+"");
	}
	
	/**
	 * subtraction Test
	 */
	@Test
	public void subtraction_Success() {
		BasicCaluclator b = new BasicCaluclator();
		double result=b.substraction(10.01, 0.01);
		assertEquals(10.0+"", result+"");
	}
	
	/**
	 * multiplication Test
	 */
	@Test
	public void multiplication_Success() {
		BasicCaluclator b = new BasicCaluclator();
		double result=b.multiplication(5, 2);
		assertEquals(10.0+"", result+"");
	}
	
	/**
	 * division Test
	 */
	@Test
	public void division_Success() {
		BasicCaluclator b = new BasicCaluclator();
		double result=b.division(100, 10);
		assertEquals(10.0+"", result+"");
	}

	/**
	 * division Test
	 */
	@Test
	public void division_Fail() {
		BasicCaluclator b = new BasicCaluclator();
		double result=b.division(9.99, 0);
		assertEquals("Infinity", result+"");
	}
}
