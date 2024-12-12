import java.util.Locale;
import java.util.Scanner;

public class Exercicio_media_idades {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade;
		int soma_idades = 0;
		int contador = 0;

		System.out.println("Digite as idades: ");

		while (true) {
			idade = sc.nextInt();
			if (idade < 0) {
				if (contador == 0) {
					System.out.println("Impossível calcular!");
				} else {
					double media = (double) soma_idades / contador;
					System.out.printf("MÉDIA = %.2f%n", media);
				}
				break;
			}
			soma_idades += idade;
			contador++;
		}
		sc.close();
	}
}
