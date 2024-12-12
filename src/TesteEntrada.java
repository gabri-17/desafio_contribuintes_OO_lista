import java.util.Locale;
import java.util.Scanner;

public class TesteEntrada {
	public static void main(String[] args) {
		// Locale: diferenciar o separarador de decimais.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // Associando o objeto sc ao teclado no modo console.
		
		String x; // string é aspas duplas.
		int y;
		double z;
		char k; // char é aspas simples.
		x = sc.next(); // Permitir digitar uma palavra e ela ser armazenada dentro da variável x.
		y = sc.nextInt();
		z = sc.nextDouble();
		k = sc.next().charAt(0);
		
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		//System.out.println("Você digitou: " + z); // Pegar a localidade independente.
		System.out.printf("Você digitou: %.2f%n" , z);
		System.out.println("Você digitou: " + k);
		
		sc.close(); // Encerrar o recurso criado.
		
	}
}
