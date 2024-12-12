import java.util.Locale;
import java.util.Scanner;

public class Exercicio_par_impar {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n, novo_n;
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			novo_n = sc.nextInt();
			if (novo_n % 2 != 0 && novo_n > 0) {
				System.out.println("IMPAR POSITIVO");
			} else if (novo_n % 2 != 0 && novo_n < 0) {
				System.out.println("IMPAR NEGATIVO");
			}
			else if (novo_n % 2 == 0 && novo_n > 0) {
				System.out.println("PAR POSITIVO");
			}
			else if (novo_n == 0) {
				System.out.println("NULO");
			}
			else {
				System.out.println("PAR NEGATIVO");
			}
		}
		sc.close();
	}
}
