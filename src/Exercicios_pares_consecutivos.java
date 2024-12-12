import java.util.Locale;
import java.util.Scanner;

public class Exercicios_pares_consecutivos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int valor_x;
		int soma = 0;

		
		System.out.print("Digite um número inteiro: ");
		valor_x = sc.nextInt();
		while(valor_x != 0) {
			
			if(valor_x % 2 != 0) {
				valor_x++;
			
			}
			soma = valor_x * 5 + 20;
			
			
			System.out.printf("Soma = %d\n", soma);
			System.out.print("Digite um número inteiro: ");
			valor_x = sc.nextInt();
			
		}
		sc.close();
	}

}
