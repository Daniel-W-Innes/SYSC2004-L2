package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import shapes.Rectangle;

/**
 *
 * @author Schramm
 */
public class RectangleTest {

	public RectangleTest() {
	}

	@Test
	public void testConstructor() {
		Rectangle r = new Rectangle(5.0, 6.0);
		assertEquals(5.0, r.getLength(), 0.001);
		assertEquals(6.0, r.getWidth(), 0.001);
	}

	@Test
	public void testConstructorNegativeLength() {
		try {
			@SuppressWarnings("unused")
			Rectangle r = new Rectangle(-5, 6);
			fail();
		} catch (IllegalArgumentException e) {
		}

	}

	@Test
	public void testConstructorNegativeWidth() {
		try {
			@SuppressWarnings("unused")
			Rectangle r = new Rectangle(5, 0);
			fail();
		} catch (IllegalArgumentException e) {
		}

	}

	@Test
	public void testPerimeter() {
		Rectangle r = new Rectangle(5.0, 6.0);
		assertEquals(22.0, r.perimeter(), 0.001);
	}

	@Test
	public void testArea() {
		Rectangle r = new Rectangle(5.0, 6.0);
		assertEquals(30.0, r.area(), 0.001);
	}

	@Test
	public void testToString() {
		Rectangle r = new Rectangle(5.0, 6.0);
		assertEquals("l=5.0 x w=6.0", r.toString());
	}
}
