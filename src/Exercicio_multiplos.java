import java.util.Scanner;

public class Exercicio_multiplos {
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler dois números inteiros, e dizer se um número é
		 * múltiplo do outro. Os números podem ser digitados em qualquer ordem.
		 */
		Scanner sc = new Scanner(System.in);
		int numero1, numero2;
		
		System.out.print("Digite dois numeros inteiros: ");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.print("São múltiplos!!");
		}
		else {
			System.out.print("Não são múltiplos!!");
		}
		
		sc.close();
	}
}
