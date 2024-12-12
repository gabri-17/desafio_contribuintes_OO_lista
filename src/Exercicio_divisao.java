import java.util.Locale;
import java.util.Scanner;

public class Exercicio_divisao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos voce vai digitar? ");
		int numCasos, numerador = 0, denominador = 0;
		double divisao = 0;
		numCasos = sc.nextInt();
		for(int i = 0; i < numCasos; i++) {
			System.out.print("Entre com o numerador: ");
			numerador = sc.nextInt();
			System.out.print("Entre com o denominador: ");
			denominador = sc.nextInt();
			if(denominador == 0) {
				System.out.println("Divisão impossível!");
			}
			else {
				divisao = (double)numerador / denominador;
				System.out.printf("Divisão = %.2f\n", divisao);
			}
		}
	}
}
