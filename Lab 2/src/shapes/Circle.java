package shapes;

public class Circle {
	private double radius;

	public Circle(double radius) {
		if (radius <= 0.0)
			throw new IllegalArgumentException("Shape's dimensions must be positive values");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public boolean equals(Object other) {
		if (other == this)
			return true;
		if (other == null)
			return false;
		if (getClass() != other.getClass())
			return false;
		Circle c = (Circle) other;
		return ((Math.abs(radius - c.radius) < 0.001));
	}

	@Override
	public String toString() {
		return "r=" + this.radius;
	}
}
