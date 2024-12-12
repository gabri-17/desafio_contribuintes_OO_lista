import java.util.Locale;
import java.util.Scanner;

public class Exercicio_retangulo {
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler as medidas da base e altura de um retângulo. Em
		 * seguida, mostrar o valor da área, perímetro e diagonal deste retângulo, com
		 * quatro casas decimais.
		 */
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int base, altura;
		double area, perimetro, diagonal;
		
		System.out.print("Base do retângulo: ");
		base = sc.nextInt();
		System.out.print("Altura do retângulo: ");
		altura = sc.nextInt();
		area = base * altura;
		System.out.printf("Área: %.4f\n", area);		
		
		
		
		perimetro = 2 * (base + altura);
		System.out.printf("Perímetro: %.4f\n", perimetro);
		
		diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		System.out.printf("Perímetro: %.4f\n", diagonal);
		sc.close();
		
		
		
		
	}
}
