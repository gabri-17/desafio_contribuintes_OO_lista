package util;

public class Calculator {
	// static final: é uma constante que independe de qualquer objeto do tipo Calculator.
	public static final double PI = 3.14159; // final: significa constante (sempre em letra maiúscula)
	
	// static circumference: operação pode ser calculada independente de objeto.
	public static double circumference(double radius) {
		return 2 * PI * radius;
	}

	public static double volume(double radius) {
		return 4 * PI * Math.pow(radius, 3) / 3;
	}
}
