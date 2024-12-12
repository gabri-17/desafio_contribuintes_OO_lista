import java.util.Locale;
import java.util.Scanner;

public class Exercicio_dentro_fora {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		int x, numero_dentro = 0, numero_fora = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			x = sc.nextInt();
			
			if(x < 10 || x > 20) {
				numero_fora++;
			}
			else {
				numero_dentro++;
			}
		}
		System.out.printf("%d dentro \n", numero_dentro);
		System.out.printf("%d fora \n", numero_fora);
		sc.close();
	}
}
