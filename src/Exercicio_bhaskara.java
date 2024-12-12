import java.util.Locale;
import java.util.Scanner;

public class Exercicio_bhaskara {
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os três coeficientes de uma equação do segundo
		 * grau. Usando a fórmula de Baskara, calcular e mostrar os valores das raízes
		 * x1 e x2 da equação com quatro casas decimais, conforme exemplo. Se a equação
		 * não possuir raízes reais, mostrar uma mensagem.
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double coeficiente_A, coeficiente_B, coeficiente_C, raiz1, raiz2, delta;
		
		System.out.print("Coeficiente a: ");
		coeficiente_A = sc.nextDouble();
		System.out.print("Coeficiente b: ");
		coeficiente_B = sc.nextDouble();		
		System.out.print("Coeficiente c: ");
		coeficiente_C = sc.nextDouble();
		
		delta = Math.pow(coeficiente_B,2) - (4 * coeficiente_A * coeficiente_C);

		
		if(delta < 0) {
			System.out.println("Esta equação não possui raízes reais!!");
		}
		else {
			raiz1= ((-coeficiente_B) + Math.sqrt(delta))/ (2* coeficiente_A);
			raiz2= ((-coeficiente_B) - Math.sqrt(delta))/ (2* coeficiente_A);
			System.out.printf("X1 = %.4f%n", raiz1);
			System.out.printf("X2 = %.4f%n", raiz2);
			
		}
		
		sc.close();
	}
}
