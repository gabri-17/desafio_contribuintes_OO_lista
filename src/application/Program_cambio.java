package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program_cambio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter currencyConverter = new CurrencyConverter();
		
		System.out.print("Qual o valor do dólar? ");
		double dolar = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados? ");
		double dolarComprados = sc.nextDouble();
		
		System.out.printf("Valor a ser pago em reais = %.2f%n", CurrencyConverter.dolarParaReal(dolarComprados, dolar));
		sc.close();
	}
}
