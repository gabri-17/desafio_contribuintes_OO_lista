import java.util.Locale;
import java.util.Scanner;

public class Exercicio_sequencia_impares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		int X = sc.nextInt();
		for (int i = 0; i <= X; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
	}
}
