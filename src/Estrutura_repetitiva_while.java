import java.util.Scanner;

public class Estrutura_repetitiva_while {
	public static void main(String[] args) {
		// Ctrl + shift + O -> fazer importações.
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		// Estrutura recomendada quando não se sabe previamente a quantidade de repetições.
		while(x != 0 || x > 0) {
//			Regra:
//			- V: executa e volta
//			- F: pula fora
			soma += x; // soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		sc.close();
	}
}
