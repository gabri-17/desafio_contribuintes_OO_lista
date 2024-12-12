import java.util.Locale;
import java.util.Scanner;

public class Exercicio_media_ponderada {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos voce vai digitar? ");
		int n;
		double valor_1, valor_2, valor_3, media;
		n = sc.nextInt();
		
		for(int i = 0; i < n ; i++) {
			System.out.println("Digite tres numeros: ");
			valor_1 = sc.nextDouble();
			valor_2 = sc.nextDouble();
			valor_3 = sc.nextDouble();
			
			media = (valor_1 * 2.0 + valor_2 * 3.0 + valor_3 * 5.0 ) / (2.0+3.0+5.0);
			System.out.printf("MEDIA = %.1f\n", media);
		}
		
		sc.close();
	}
}
