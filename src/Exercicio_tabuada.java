import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_tabuada {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.print("Deseja a tabuada para qual valor? ");
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		
		for(int i = 1; i <= 10;i++) {
			System.out.println(numero + " X " + i  + " = " + (numero*i));
		}
		
		sc.close();
		
	}
}
