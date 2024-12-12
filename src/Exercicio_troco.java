import java.util.Locale;
import java.util.Scanner;

public class Exercicio_troco {
	public static void main(String[] args) {
		/*
		 * Fazer um programa para calcular o troco no processo de pagamento de um
		 * produto de uma mercearia. O programa deve ler o preço unitário do produto, a
		 * quantidade de unidades compradas deste produto, e o valor em dinheiro dado
		 * pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
		 * mostrar o valor do troco a ser devolvido ao cliente.
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double precoUnitario, valorDinheiro, troco;
		int qtdUnidadesCompradas;
		
		System.out.print("Preço unitário do produto: ");
		precoUnitario = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		qtdUnidadesCompradas = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		valorDinheiro = sc.nextDouble();
		sc.close();
		
		troco = valorDinheiro - ( precoUnitario * qtdUnidadesCompradas);
		System.out.printf("Troco = %.2f\n", troco);
		
		

	}
}
