import java.util.Locale;
import java.util.Scanner;

public class Exercicio_faca_enquanto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resposta; // Assim, tem que declarar a variável aqui fora. 
		
		do {
			/*
			 * Regra:
			 * 
			 * - V: volta
			 * - F: pula fora
			 * */
//			char resposta = 's';
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();
			double fahrenheit = 9.0 * celsius / 5 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			System.out.print("Deseja repetir (s/n)? ");
			// Por padrão, o compilador não enxerga o que foi declarado só dentro das chaves.
			resposta = sc.next().charAt(0);
			
		} while (resposta != 'n');
		
		
		
		sc.close();
	}
}
