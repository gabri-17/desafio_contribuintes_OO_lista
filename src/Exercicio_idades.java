import java.util.Locale;
import java.util.Scanner;

public class Exercicio_idades {
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar
		 * uma mensagem com os nomes e a idade média entre essas pessoas, com uma casa
		 * decimal.
		 */
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int idade1, idade2;
		double media;
		String nome1, nome2;
		
		System.out.println("Dados da primeira pessoa: ");
		System.out.print("Nome: ");
		nome1 = sc.next();
		System.out.print("Idade: ");
		idade1 = sc.nextInt();

		System.out.println("Dados da segunda pessoa: ");
		System.out.print("Nome: ");
		nome2 = sc.next();
		System.out.print("Idade: ");
		idade2 = sc.nextInt();
		
		media = (idade1 + idade2) / 2.0;
		
		System.out.printf("A idade média de %s e %s é: %.1f anos", nome1, nome2, media);
	}
}
