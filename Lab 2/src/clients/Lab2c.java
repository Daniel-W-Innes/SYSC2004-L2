package clients;

import java.util.Random;

import shapes.Circle;

public class Lab2c {

	public static void main(String[] args) {
		Random r = new Random();
		Circle[] circles = new Circle[10];
		double[] areas = new double[10];
		double[] perimeters = new double[10];
		for (int i = 0; i < 10; ++i) {
			circles[i] = new Circle(r.nextDouble());
			areas[i] = circles[i].area();
			perimeters[i] = circles[i].perimeter();
			System.out.println("Circle " + i + "(" + circles[i].getRadius() + ") : Area = " + areas[i] + ", " + "Perimeter = " + perimeters[i] + ".");
		}
	}

}
