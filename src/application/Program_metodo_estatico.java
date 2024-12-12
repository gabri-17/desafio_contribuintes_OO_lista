package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program_metodo_estatico {
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Membro estático vai dar o mesmo resultado independente de qualquer objeto.
		
		// Membros da classe não são estáticos, é obrigado a instanciar um objeto
		//Calculator calc = new Calculator();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		// Na mesma classe, não é possível chamar um método não estático dentro de outro estático.
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		
		sc.close();
	}
	
	
}
