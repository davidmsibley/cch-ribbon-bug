package gov.usgs.cida.cch.ribbon.bug;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dmsibley
 */
public class AngleTest {

	public AngleTest() {
	}

	public static final Point prevStart = new Point(-72.1932, 40.9392);
	public static final Point prevEnd = new Point(-72.1824, 40.9429);

	public static final Point currStart = new Point(-72.1824, 40.9429);
	public static final Point currEnd = new Point(-72.1716, 40.9467);

	/**
	 * Test of getAngle method, of class Angle.
	 */
	@Test
	public void testGetAngle() {
		System.out.println("getAngle");
		
		Double expResult = toPositive(Angle.getAngle(prevStart, currStart, currEnd));
		Double result = toPositive(Angle.getAngle(currStart, currEnd));
		assertEquals(expResult, result);
	}
	
	public static Double toPositive(Double angle) {
		Double result = angle;
		Double TWO_PI = Math.PI * 2;
		
		if (0 > angle) {
			result = TWO_PI + angle;
		}
		
		return result;
	}

}
