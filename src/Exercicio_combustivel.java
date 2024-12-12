import java.util.Locale;
import java.util.Scanner;

public class Exercicio_combustivel {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
		int tipo_combustivel = sc.nextInt();
		int alcool = 0, diesel = 0, gasolina = 0;

		while (tipo_combustivel != 4) {
			if (tipo_combustivel == 1) {
				alcool++;
			} else if (tipo_combustivel == 2) {
				gasolina++;
			} else if (tipo_combustivel == 3) {
				diesel++;
			}
			
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			tipo_combustivel = sc.nextInt();
		}


		System.out.println("MUITO OBRIGADO");
		System.out.printf("Álcool: %d\n", alcool);
		System.out.printf("Gasolina: %d\n", gasolina);
		System.out.printf("Diesel: %d\n", diesel);
		sc.close();
	}
}
