package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double dolarParaReal(double quantidade, double precoDolar) {
		return quantidade * precoDolar * (1.0 + IOF); 
	}
}
