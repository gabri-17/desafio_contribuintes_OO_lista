import java.util.Locale;
import java.util.Scanner;

public class Exercicio_validacao_nota {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double nota_1 = sc.nextDouble();

		while (nota_1 < 0 || nota_1 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			nota_1 = sc.nextDouble();
		}

		System.out.print("Digite a segunda nota: ");
		double nota_2 = sc.nextDouble();
		while (nota_2 < 0 || nota_2 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			nota_2 = sc.nextDouble();
		}

		double media = (nota_1 + nota_2) / 2;
		System.out.printf("MÉDIA = %.2f%n", media);

		sc.close();

	}
}
