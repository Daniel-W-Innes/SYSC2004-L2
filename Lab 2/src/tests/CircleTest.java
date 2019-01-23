package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import shapes.Circle;

/**
 *
 * @author Schramm
 */
public class CircleTest {

	public CircleTest() {
	}

	@Test
	public void testConstructor() {
		Circle c = new Circle(5.0);
		assertEquals(5.0, c.getRadius(), 0.001);
	}

	@Test
	public void testConstructorNegative() {
		try {
			@SuppressWarnings("unused")
			Circle c = new Circle(-5.0);
			fail();
		} catch (IllegalArgumentException e) {
		}

	}

	@Test
	public void testPerimeter() {
		Circle c = new Circle(6.0);
		assertEquals(2 * 6.0 * 3.14159, c.perimeter(), 0.001);
	}

	@Test
	public void testArea() {
		Circle c = new Circle(6.0);
		assertEquals(6.0 * 6.0 * 3.14159, c.area(), 0.001);
	}

	@Test
	public void testToString() {
		Circle c = new Circle(5.0);
		assertEquals("r=5.0", c.toString());
	}
}
