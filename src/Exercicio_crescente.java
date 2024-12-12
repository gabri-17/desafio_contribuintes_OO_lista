import java.util.Locale;
import java.util.Scanner;

public class Exercicio_crescente {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
		double x = sc.nextInt();
		double y = sc.nextInt();
		
		while(true) {
			if(x == y) {
				break;
			}
			else if (x < y) {
				System.out.println("Crescente!");
			}
			else {
				System.out.println("Decrescente!");
			}
			
			System.out.println("Digite outro dois números: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}
}
