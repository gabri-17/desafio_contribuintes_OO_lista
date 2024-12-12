import java.util.Iterator;
import java.util.Scanner;

public class Estrutura_repetitiva_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		
		// Estrutura ótima para se fazer uma repetição baseada em uma CONTAGEM.
		for (int i = 0; i < N;i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		sc.close();
		
		for(int i = 4; i >= 0; i--) {
			System.out.println("Valor de i: " + i);
		}
	}
}
