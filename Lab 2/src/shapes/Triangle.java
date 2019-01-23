package shapes;

public class Triangle {
	private double base;
	private double height;

	public Triangle(double base, double height) {
		if (base <= 0.0 || height <= 0.0)
			throw new IllegalArgumentException("Shape's dimensions must be positive values");
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public double perimeter() {
		return base + Math.sqrt(Math.pow(base, 2) + 4 * Math.pow(height, 2));
	}

	public double area() {
		return 0.5 * base * height;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this)
			return true;
		if (other == null)
			return false;
		if (getClass() != other.getClass())
			return false;
		Triangle t = (Triangle) other;
		return ((Math.abs(base - t.base) < 0.001) && (Math.abs(height - t.height) < 0.001));
	}

	@Override
	public String toString() {
		return "b=" + base + " x h=" + height;
	}

}
