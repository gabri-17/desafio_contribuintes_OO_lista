import java.util.Locale;
import java.util.Scanner;

public class Exercicio_fatorial {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de N: ");
		int n, fatorial = 1;
		n = sc.nextInt();
		for (int i = n; i > 0; i--) {
			fatorial *=i;
		}
		System.out.printf("Fatorial = %d\n", fatorial);
		sc.close();
	}
}
