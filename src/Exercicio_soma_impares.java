import java.util.Locale;
import java.util.Scanner;

public class Exercicio_soma_impares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
		int valor_x = sc.nextInt();
		int valor_y = sc.nextInt();
		int soma, troca;
		
		
	 
		if (valor_x > valor_y) {
			troca = valor_x; // troca = 6
			valor_x = valor_y; // x = -5 / y = -5
			valor_y = troca; // y = 6
		}
		
		soma = 0;
		for (int i = valor_x + 1; i < valor_y; i++) {
			if (i % 2 != 0) {
				soma += i; // soma = soma + i;
			}
		}
		
		System.out.printf("Soma dos impares = %d\n", soma);
		sc.close();
	}
}
